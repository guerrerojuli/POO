require_relative "item"

class Ticket
  @@TICKET_NUM = 1000

  def initialize
    @items = []
    @num = @@TICKET_NUM
    @@TICKET_NUM += 1
  end

  def add(product, amount)
    exist_item = @items.find { |item| item.product == product }
    if exist_item
      exist_item.amount += amount
    else
      @items.push(Item.new(product, amount))
    end
  end

  def to_s
    s = "TICKET Nº #{@num}\n"
    s+="####################\n"
    total = 0
    @items.each { |item| s+= "#{item} \n"; total += item.total }
    s+= "####################\n"
    s+= "#{format("Total: $%.2f", total)}"
  end
end
