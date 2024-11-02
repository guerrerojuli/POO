require_relative "item"
require "set"

class Ticket
  @@TICKET_NUM = 1000

  def initialize
    @items = Set.new
    @num = @@TICKET_NUM
    @@TICKET_NUM += 1
  end

  def add(product, amount)
    @items << (Item.new(product, amount))
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
