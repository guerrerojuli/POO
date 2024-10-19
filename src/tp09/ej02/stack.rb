class Stack
  def initialize
    @stack = []
  end

  def push(item)
    @stack.push(item)
  end

  def peek
    raise "Stack is empty"  if empty?
    @stack.last
  end

  def pop
    raise "Stack is empty"  if empty?
    @stack.pop
  end

  def empty?
    @stack.empty?
  end
end
