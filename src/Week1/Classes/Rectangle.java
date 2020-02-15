package Week1.Classes;

public class Rectangle {
  private int width = 1;
  private int height = 1;
  private String color = "Blue";

  public Rectangle(int width, int height, String color) {
    this.setHeight(height);
    this.setWidth(width);
    this.setColor(color);
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public String getColor() {
    return this.color;
  }

  public void setWidth(int width) {
    this.width = width > 0 ? width : 1;
  }

  public void setHeight(int height) {
    this.height = height > 0 ? height : 1;
  }

  public void setColor(String color) {
    if (color.length() > 2 && color.length() < 20) {
      this.color = color;
    }
  }

  public void draw() {
    char c = this.color.charAt(0);
    for (int i = 0; i <= this.height - 1; i++) {
      for (int j = 0; j <= this.width - 1; j++) {
        System.out.print(c);
      }
      System.out.println("");
    }
  }
}