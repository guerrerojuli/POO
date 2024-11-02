class Product
  attr_reader :description, :price

  def initialize(description, price)
    @description = description
    @price = price
  end
end
