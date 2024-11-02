require_relative "plain_text"

class FormatText < PlainText
  def initialize(format, content)
    super(content)
    @format = format
  end

  def source
    "<#{@format}>#{@content}</#{@format}>"
  end
end
