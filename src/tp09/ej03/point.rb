class Point
  attr_reader :x, :y

  def initialize(x, y)
    @x = x.to_f
    @y = y.to_f
  end

  def distance(other)
    ((@x - other.x)**2 + (@y - other.y)**2)**(0.5)
  end

  def to_s
    "{#{@x}, #{@y}}"
  end

  def ==(other)
    return false unless other.is_a? Point
    @x == other.x && @y == other.y
  end

  def hash
    [@x, @y].hash
  end

  def eql?(other)
    self == other
  end
end

