require_relative "museum"

class ThemedMuseum < Museum
  def add_exhibition(pavilion, exhibition, theme)
    raise "Theme does not match" if pavilion.theme != theme 
    super(pavilion, exhibition, theme)
  end
end
