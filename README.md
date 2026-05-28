# BabyCam 📱📹

A peer-to-peer Android camera streaming application that enables direct device-to-device video transmission using WiFi Direct.

## About the Project 💡

BabyCam demonstrates how to connect and share camera streaming between Android devices using WiFi Direct and socket communication. The project wraps Android framework APIs into reusable library modules for fast and convenient implementation of camera streaming solutions.

### Key Features 🚀

- **Peer-to-Peer Connection**: Seamless device discovery and connection via WiFi Direct
- **Real-time Video Streaming**: UDP datagram socket-based streaming for low-latency transmission
- **Modern Camera Support**: Built with CameraX APIs for robust camera handling
- **Video Encoding**: H.264 (AVC) video codec support
- **Client-side Recording**: Record streamed video directly on the client device
- **Separate APKs**: Dedicated server and client applications for flexible deployment
- **Quality Selection**: Choose from multiple streaming quality options (SD, HD, Full HD)

## Technical Stack 🛠️

- **Primary Language**: Kotlin (80.1%)
- **Secondary Language**: Java (19.9%)
- **Framework**: Android CameraX
- **Connectivity**: WiFi Direct P2P
- **Protocol**: UDP Datagram Sockets
- **Video Encoding**: H.264 (AVC)

## Architecture 🏗️

### Components

- **Server Module**: Camera stream provider using WiFi Direct
- **Client Module**: Stream receiver and consumer with recording capability
- **Library Modules**: Reusable WiFi Direct and streaming abstractions

### Communication Flow

1. Server and client discover each other via WiFi Direct
2. Client requests connection from server
3. Connection established between devices
4. Camera stream transmitted via UDP socket
5. Client receives and renders stream in real-time
6. Optional: Client records stream to local storage

## Roadmap 🛣️

### Upcoming Features

- [ ] TCP streaming support (alternative to UDP)
- [ ] RTSP (Real Time Streaming Protocol) support
- [ ] HEVC (H.265) video codec support
- [ ] MPEG4 video codec support
- [ ] Enhanced streaming quality options
- [ ] Network optimization improvements

## Project Statistics 📊

- **Repository**: Jghori1/BabyCam
- **Visibility**: Private
- **Status**: Active Development
- **Last Updated**: January 17, 2026
- **Repository Size**: ~17.8 MB

## Getting Started 🎯

### Prerequisites

- Android Studio (latest version recommended)
- Android SDK 21 or higher
- WiFi Direct capable Android devices (API 14+)
- Two Android devices for peer-to-peer testing

### Building

```bash
# Clone the repository
git clone https://github.com/Jghori1/BabyCam.git

# Open in Android Studio
# Build server APK
gradle :server:build

# Build client APK
gradle :client:build
```

### Running

1. Install server APK on first device
2. Install client APK on second device
3. Launch server app on first device
4. Launch client app on second device
5. Discover peers and establish connection
6. Start camera streaming

## Use Cases 🔍

- **Remote Monitoring**: Monitor cameras from another Android device
- **Educational Project**: Learn WiFi Direct and real-time streaming implementation
- **Live Preview**: Share camera feed between team members on local network
- **Recording Sessions**: Capture streaming video for later review

## License 📜

This project is provided as-is for educational and development purposes.

## Contributing 🤝

Feel free to fork this repository and submit pull requests for any improvements or bug fixes.

## Author ✍️

**Jghori1** - [GitHub Profile](https://github.com/Jghori1)

---

**Built with ❤️ for Android developers and enthusiasts**
