
public class Car {
    private String name;
    private int position = 0;

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move() {
        this.position++;
    }

    private void validateName(String name) {
        if (name == null || "".equals(name)) {
            throw new RuntimeException("자동차의 이름은 null이거나 공백일 수 없습니다.");
        }
    }
}
