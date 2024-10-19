class Rectangle < Figure
  attr_reader :corner1, :corner2

  def initialize(corner1, corner2)
    @corner1 = corner1
    @corner2 = corner2
  end

  def perimeter
    2 * (@corner1.x - @corner2.x).abs + 2 * (@corner1.y - @corner2.y).abs
  end

  def area
    (@corner1.x - @corner2.x).abs * (@corner1.y - @corner2.y).abs
  end 

  def ==(other)
    return false unless other.is_a? Rectangle
    @corner1 == other.corner1 && @corner2 == other.corner2
  end

  def to_s
    "Rectangle [ #{@corner1} #{@corner2} ]"
  end
end
