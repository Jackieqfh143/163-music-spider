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






