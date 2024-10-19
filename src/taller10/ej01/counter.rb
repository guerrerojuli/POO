class Counter
  attr_reader :count
  attr_writer :count

  def initialize 
    @count = 0
  end

  def increment 
    @count += 1
  end

  def decrement 
    @count -= 1
  end

  def to_s
    "Counter #{@count}"
  end
end

my_counter = Counter.new
my_counter.count = 10
my_counter.increment
puts my_counter.count # Imprime 11
puts my_counter
