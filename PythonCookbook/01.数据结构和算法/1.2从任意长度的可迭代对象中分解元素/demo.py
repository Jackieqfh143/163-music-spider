### 1.2.1 问题

'''

需要从某个可迭代对象中分解出N个元素, 但是这个迭代对象的长度可能超过N,
这会导致出现 "分解的值过多(too many values to unpack)" 的异常.

'''

### 1.2.2 解决方案

'''

Python 的 "*表达式" 可以用来解决这个问题.例如,假设开设一门课程,并决定在期末
的作业成绩中去掉第一个和最后一个,只对中间剩下的成绩做平均分统计.如果只有4个
成绩,也许可以简单的将4个部分都分解出来,但是如果有24个呢? *表达式使这一切变
简单

'''

def drop_first_last(grades):

	first, *middle, last = grades

	return avg(middle)

'''

另一个用例是假设有一些用户记录,记录由姓名和电子邮件地址组成, 后面跟着任
意数量的电话号码.则可以像这样分解记录

'''

user_record = ('Dave', 'dave@example.com', '773-555-1212', '847-555-1212')

name, email, *phone_numbers = user_record

print(name)  # 'Dave'

print(email) # 'dave@example.com'

print(phone_numbers) # ['773-555-1212',' 847-555-1212']

'''

不管要分解出多少个电话号码(甚至没有电话号码), 变量 phone_numbers 都一直是列表.

'''

'''

由*修饰的变量也可以位于列表的第一个位置.

'''

*trailing, current = [10, 8, 7, 1, 9, 5, 10, 3]

print(trailing) # [10, 8, 7, 1, 9, 5, 10]

print(current) # 3

### 1.2.3 讨论

'''

*式的语法在迭代一个变长的元组序列时尤其有用.列如,假设有一个带标记的元组序列

'''

records = [
	('foo', 1, 2),
	('bar', 'hello'),
	('foo', 3, 4),
]

def do_foo(x, y):

	print('foo', x, y)


def do_bar(s):

	print('bar', s)


for tag, *args in records:

	if tag == 'foo':

		do_foo(*args)

	elif tag == 'bar':

		do_bar(*args)


'''

当和某些特定的字符串处理操作相结合, 比如做拆分操作时, 这种*式
的语法所支持的分解操作也非常有用.

'''

line = 'nobody:*:-2:-2:Unprivileged User:/var/empty:/usr/bin/false'

uname, *fields, homedir, sh = line.split(':')

print(uname) # 'nobody'

print(homedir) # '/var/empty'

print(sh) # '/usr/bin/false'


'''

有时可能想分解出某些值然后丢弃它们.在分解的时候,不能只是指定一个单独的*,
但是可以使用几个常用来表示待丢弃值的变量名, 比如_或者ign (ignired).

'''

record = ('ACME', 50, 123.45, (12, 18, 2012))

name, *_, (*_, year) = record

print(name) # 'ACME'

print(year) # 2012


'''

*分解操作和各种函数式语言中的列表处理功能有着一定的相似性.例如,如果有一个
列表,可以像下面这样轻松将其分解为头部和尾部:

'''

items = [1, 10, 7, 4, 5, 9]

head, *tail = items

print(head) # 1

print(tail) # [10, 7, 4, 5, 9]


'''

在编写执行这类拆分功能的函数时, 人们可以假设这是为了实现某种精巧的递归算法.例如:

'''

def sum(items):

	head, *tail = items

	return head + sum(tail) if tail else head


print(sum(items)) # 36


'''

但是请注意,递归真的不算是 Python 的强项,这是因为其内在的递归限制所致.因此,
最后一个例子在实践中没有太大的意义, 只不过是一点学术上的好奇罢了.

'''






