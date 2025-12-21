# 📘 Algorithm Hub - Cấu trúc Dữ liệu & Giải thuật

![Java CI](https://github.com/TristanLong/Algorithm-Hub/actions/workflows/maven-build.yml/badge.svg)

Kho lưu trữ mã nguồn các thuật toán và cấu trúc dữ liệu kinh điển, được triển khai bằng **Java**. Dự án sử dụng **Composite Design Pattern** để xây dựng hệ thống Menu Console chuyên nghiệp, tách biệt hoàn toàn giữa Logic và Giao diện Demo.

## 📂 Cấu trúc Dự án

Source code nằm trong `src/main/java/com/hub/` được chia thành 3 tầng:

| Package          | Vai trò        | Quy tắc Code                                                        |
|:-----------------|:---------------|:--------------------------------------------------------------------|
| **`algorithms`** | **Core Logic** | Chỉ chứa thuật toán thuần túy. KHÔNG `System.out`, KHÔNG giao diện. |
| **`demos`**      | **UI Demo**    | Kế thừa `DemoRunner`. Gọi Core Logic và in kết quả ra màn hình.     |
| **`ui`**         | **System**     | Bộ khung Menu đa cấp (Composite Pattern).                           |

## 🚀 Hướng dẫn Cài đặt & Chạy

### Yêu cầu
* Java JDK 17+
* Maven

### Cách chạy (Run)
1. Clone dự án về máy.
2. Mở bằng IntelliJ IDEA hoặc VS Code.
3. Chạy file `src/main/java/com/hub/Main.java`.

Giao diện Console sẽ hiện ra:
```text
=== ALGORITHM HUB ===
1. Sorting Algorithms
2. Searching Algorithms
3. Graph Algorithms
0. Exit
>> Choose: