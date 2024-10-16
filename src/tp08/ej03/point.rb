class Point
  attr_reader :x, :y

  def initialize(x, y)
    @x = x
    @y = y
  end

  def distance(other)
    ((@x - other.x)**2 + (@y - other.y)**2)**(1/2)
  end

  def to_s
    "{#{@x}, #{@y}}"
  end
end

my_point = Point.new(1.5, 2.5)
puts my_point # Imprime {1.5, 2.5}
puts my_point.distance(Point.new(1.5, 3.0)) # Imprime 0.5
