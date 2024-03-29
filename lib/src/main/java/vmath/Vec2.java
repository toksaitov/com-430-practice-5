package vmath;

public class Vec2 {
    private float x;
    private float y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public Vec2(float x, float y) {
        if (Float.isNaN(x) || Float.isNaN(y)) {
            throw new ArithmeticException();
        }
        this.x = x;
        this.y = y;
    }

    public float x() {
        return x;
    }

    public float y() {
        return y;
    }

    public float mag() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vec2 norm() {
        float mag = mag();
        return new Vec2(x / mag, y / mag);
    }

    public Vec2 add(Vec2 other) {
        return new Vec2(x + other.x, y + other.y);
    }

    public Vec2 sub(Vec2 other) {
        return new Vec2(x - other.x, y - other.y);
    }

    public Vec2 mul(float other) {
        return new Vec2(x * other, y * other);
    }

    public float dot(Vec2 other) {
        return x * other.x + y * other.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
