require_relative "point"

class Bag
  def initialize
    @bag = Hash.new(0)
  end

  def add(item)
    @bag[item] += 1 
  end
    
  def size
    @bag.size
  end

  def count(item)
    @bag[item]
  end

  def delete(item)
    if @bag[item] == 1
      @bag.delete(item)
    else
      @bag[item] -= 1
    end
  end

  def to_s
    @bag.to_s()
  end
end


my_bag = Bag.new
my_bag.add(Point.new(0, 0))
my_bag.add(Point.new(1, 2))
my_bag.add(Point.new(3, 4))
my_bag.add(Point.new(1, 2))
puts my_bag
puts my_bag.size
puts my_bag.count(Point.new(1, 2))
puts my_bag.delete(Point.new(1, 2))
puts my_bag
puts my_bag.delete(Point.new(1, 2))
puts my_bag
