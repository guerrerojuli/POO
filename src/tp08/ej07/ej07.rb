a = String.new("Hola Mundo")
b = String.new("Hola Mundo")
puts a == b
puts a === b
puts a.eql? b
puts a.equal? b
puts a <=> b

# `==`: Tests for value equality (i.e., same sequence of characters)
# `===`: Tests for value equality and class membership (used in `case` statements)
# `eql?`: Tests for value equality and class equality
# `equal?`: Tests for object identity (i.e., same instance)
# `<=>`: Compares two objects and returns an integer indicating the result of the comparison

# According to the Ruby documentation, it's recommended to override the following methods in subclasses: 
# `==` (value equality)
# `eql?` (value and class equality)
# `<=>` (comparison)
