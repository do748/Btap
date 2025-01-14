# README Báo Cáo JUnitNangCao Lê Thành Đô 22IT-SE1.1

## 1. Mô tả dự án
Dự án này là một bài tập nâng cao nhằm thực hành kiểm thử tự động với **JUnit**, áp dụng trên các thuật toán thông dụng. Mục tiêu của bài tập là giúp người học hiểu rõ cách thiết kế, triển khai và kiểm thử các phương thức, bao gồm cả xử lý ngoại lệ và các trường hợp biên.

Phạm vi của bài tập bao gồm:
- Cài đặt và kiểm thử các thuật toán phổ biến.
- Đạt được coverage cao (100% branch coverage).
- Tích hợp kiểm thử tự động với JUnit.

---

## 2. Cấu trúc thư mục

```
Dự án kiểm thử thuật toán
├── src
│   ├── main
│   │   └── java
│   │       └── com.project
│   │           └── Algorithms.java  // Chứa các thuật toán cần kiểm thử.
│   └── test
│       └── java
│           └── AlgorithmsTest.java  // Chứa các kiểm thử JUnit.
└── README.md  // Tài liệu mô tả dự án.
```

### Mô tả thư mục và tệp chính:
- `Algorithms.java`: Cài đặt các thuật toán phổ biến như tìm số lớn thứ hai, kiểm tra chuỗi đối xứng, đếm số lần xuất hiện của từ, v.v.
- `AlgorithmsTest.java`: Các bài kiểm thử JUnit để xác minh tính đúng đắn của các thuật toán trong `Algorithms.java`.
- `README.md`: Tệp tài liệu chi tiết về dự án.

---

## 3. Hướng dẫn cài đặt

### Bước 1: Cài đặt các công cụ cần thiết
- **Java Development Kit (JDK)**: Phiên bản 11 trở lên.
- **IntelliJ IDEA**: IDE để quản lý và chạy dự án.
- **Maven**: Quản lý phụ thuộc và build dự án (tích hợp sẵn trong IntelliJ IDEA).

### Bước 2: Clone dự án
Sử dụng lệnh sau để tải mã nguồn dự án:
```bash
git clone https://github.com/do748/Btap.git
```

### Bước 3: Cài đặt các phụ thuộc
Mở dự án trong IntelliJ IDEA và đảm bảo Maven tự động tải các thư viện cần thiết từ tệp `pom.xml`.

---

## 4. Hướng dẫn sử dụng

### Chạy kiểm thử JUnit
1. Mở tệp `AlgorithmsTest.java` trong IntelliJ IDEA.
2. Nhấn chuột phải và chọn **Run 'AlgorithmsTest'**.
3. Kết quả kiểm thử sẽ hiển thị trên cửa sổ **Run**.

## 5. Yêu cầu hệ thống

### Phần cứng
- CPU: Tối thiểu Intel Core i3 hoặc tương đương.
- RAM: Tối thiểu 4GB (khuyến nghị 8GB).
- Ổ đĩa: Dung lượng trống tối thiểu 2GB.

### Phần mềm
- **Hệ điều hành**: Windows, macOS, hoặc Linux.
- **JDK**: Phiên bản 11 trở lên.

---

Cảm ơn bạn đã sử dụng dự án này!

![Screenshot 2025-01-15 003459](https://github.com/user-attachments/assets/2c6982f8-a2d7-45dc-bd7d-9c0f0bb12651)
