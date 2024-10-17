class Rectangle < Figure
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

  def to_s
    "Rectangle [ #{@corner1} #{@corner2} ]"
  end
end
