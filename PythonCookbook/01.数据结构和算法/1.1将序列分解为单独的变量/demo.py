### 1.1.1 问题

'''

我们有一个包含N个元素的元组或序列,现在想将他分解为N个单独的变量.

'''

### 1.1.2 结局方案

'''

任何序列(或可迭代对象)都可以通过一个简单的赋值操作来分解为单独的变量.
唯一的要求是变量的总数和结构要和序列相吻合.

'''

p = (4, 5)

x, y = p

print(x) # 4

print(y) # 5

##################

data = ['ACME', 50, 91.1, (2012, 12, 21) ]

name, shares, price, date  = data

print(name) # 'ACME'

print(date) # (2012, 12, 21)

##################

name, shares, price, (year, mon, day) = data

print(name) # 'ACME'

print(year) # 2012

print(mon) # 12

print(day) # 21

'''

如果元素的数量不平配讲得到一个错误信息

'''

p = (4, 5)

try:

	x, y, z = p

except ValueError as e:

	print('元素数量不匹配')


### 1.1.3 讨论

'''

实际上不仅仅只是元组或列表,只要对象恰好是可迭代的, 那么就可以执行分解操作.
这包括字符串, 文件, 迭代器以及生成器.

'''

s = 'Hello'

a, b, c, d, e = s

print(a) # 'H'

print(b) # 'e'

print(e) # 'o'


'''

但做分解操作时,有时候可能想丢弃某些特定的值. Python 并没有提供特殊的语法来
实现这一点, 但是通常可以选一个用不到的变量名, 以此来作为要丢弃的值的名称.

'''

data = ['ACME', 50, 91.1, (2012, 12, 21) ]

_, shares, price, _ = data

print(shares) # 50

print(price) # 91.1


'''

但是请确保选择的变量没有在其他地方用到过.

'''
