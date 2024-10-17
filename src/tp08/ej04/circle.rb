class Circle < Ellipse
  def initialize(center, ratio)
    super(center, ratio, ratio) # Call the Ellipse initializer with equal radio
    @center = center
    @ratio = ratio
  end

  def to_s
    "Circle [ #{@center}, #{@ratio} ]"
  end
end
