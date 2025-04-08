### Link Backend: https://github.com/ducminh1804/Backend-Booking-Ticket
# 🎟️ Booking Ticket - Ứng dụng đặt vé xem phim

Ứng dụng Android giúp người dùng dễ dàng xem lịch chiếu, chọn ghế, thanh toán và quản lý thông tin cá nhân.  
Phát triển bằng **Java** trên nền tảng **Android SDK 34**, giao diện hiện đại và trải nghiệm mượt mà.

---

## 🚀 Công nghệ sử dụng

| Công nghệ | Mục đích sử dụng |
|----------|------------------|
| **Java** | Ngôn ngữ chính để xây dựng toàn bộ ứng dụng |
| **Android SDK 34** | Nền tảng chạy ứng dụng, hỗ trợ các API mới |
| **AndroidX + Material Design** | Xây dựng giao diện hiện đại, tương thích cao |
| **ConstraintLayout + GridLayout** | Tối ưu layout hiển thị trên nhiều thiết bị |
| **Navigation Component** | Điều hướng giữa các màn hình, hỗ trợ back stack |
| **JUnit, Espresso** | Kiểm thử đơn vị và UI tự động |

---

## 📌 Tính năng chính

- ✅ Xem danh sách lịch chiếu phim
- ✅ Chọn ghế theo sơ đồ rạp
- ✅ Thanh toán và xác nhận đặt vé
- ✅ Trang thông tin người dùng
- ✅ Trang cài đặt cá nhân
- ✅ Hỗ trợ ngôn ngữ RTL (Right-to-left)
- ✅ Giao diện responsive, tối ưu cho điện thoại

---

## 📂 Cấu trúc màn hình chính

| Màn hình | Tên Activity |
|----------|---------------|
| Trang chủ | `MainActivity` |
| Lịch chiếu phim | `ScreeningPage` |
| Chi tiết suất chiếu | `Screening_Detail_Page.ScreeningActivity` |
| Chọn ghế | `Seat_Page.SeatActivity` |
| Thanh toán | `PayPage`, `PayPage_SettingPage.PayPage` |
| Cài đặt | `PayPage_SettingPage.SettingPage` |
| Thông tin người dùng | `PersonPage.PersonPageActivity` |

---

## ▶️ Hướng dẫn chạy app

1. Clone project:
   ```bash
   git clone https://github.com/yourusername/bookingticket.git

<p align="center">
    <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131533/z6474999183929_7cb7c001acd232edf39dcc87ab3cd5ae_yfqqmj.jpg" alt="Trang chủ" width="300"/>
      <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131533/z6474999266733_fb23dd296b626eb6af40e0910dde89d8_bopltq.jpg" alt="Trang chủ" width="300"/>
  <br>
  <em>Giao diện Đăng kí, Đăng nhập</em>
    <br></br>
</p>
<p align="center">
    <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131533/z6474999183948_8a6c48c5023d2ff61278bc008f28e5f4_pmohjb.jpg" alt="Trang chủ" width="300"/>
      <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131532/z6474999144978_dd1d1f8c9682a0572403c107b01d8fe5_oe8a6y.jpg" alt="Trang chủ" width="300"/>
  <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131533/z6474999266921_2db2e18b50ed0b71e4d8c7e73201aa18_ym36pu.jpg" alt="Trang chủ" width="300"/>
  <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131534/z6474999183928_e1895eac970b587acb872ec61990f609_j2axbn.jpg" alt="Trang chủ" width="300"/>
  <br>
  <em>Giao diện các màn hình chính của ứng dụng</em>
    <br></br>
</p>

<p align="center">
    <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131533/z6474999225790_35f6c4c0fb48a78f7fa8e76d6eac3fd2_bxmusn.jpg" alt="Trang chủ" width="300"/>
      <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131532/z6474999183845_3ed52dcbddf4d6d20bb24b7ffa1175e6_u1imcd.jpg" alt="Trang chủ" width="300"/>
  <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131532/z6474999104358_3968c02801eddf26c98395f365f78add_i55lfp.jpg" width="300"/>
  <br>
  <em>Giao diện màn hình chọn phim, ghế và combo</em>
    <br></br>
</p>

<p align="center">
    <img src="https://res.cloudinary.com/dpgnm1bdi/image/upload/v1744131532/z6474999144759_cc3a313868c41d2b29f6d4f119190ac2_ajtyyy.jpg" alt="Trang chủ" width="300"/>
  
  <br>
  <em>Giao diện thanh toán</em>
    <br></br>
</p>

