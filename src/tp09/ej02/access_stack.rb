class AccessStack < Stack
  def initialize
    super
    @push_acc = 0
    @pop_acc = 0
  end

  def push(item)
    to_ret = super(item)
    @push_acc += 1
    to_ret
  end

  def pop
    to_ret = super
    @pop_acc += 1
    to_ret
  end

  def push_accesses
    @push_acc
  end

  def pop_accesses
    @pop_acc
  end
end
