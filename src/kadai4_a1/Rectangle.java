package kadai4_a1;

public class Rectangle {
	int top, left, width, height;

	enum OverlapState {
		IN, OUT, OVERLAP
	};

	Rectangle(int top, int left, int width, int height) {
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
	}

	OverlapState checkOverlap(Rectangle r) {
		// 実装せよ
		if (top < r.top && left < r.left && r.width < width - (r.left - left) && r.height < height - (r.top - top)) // 内側
			return OverlapState.IN;
		if (top > r.top && r.height < top - r.top) // 自分よりも上の外側
			return OverlapState.OUT;
		if (left > r.left && r.width < left - r.left) // 自分よりも左の外側
			return OverlapState.OUT;
		if (top + height < r.top || left + width < r.width) // 自分よりも下もしくは右の外側
			return OverlapState.OUT;
		else
			return OverlapState.OVERLAP;
	}
}
