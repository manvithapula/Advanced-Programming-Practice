#include <iostream>
struct Image {
int width;
int height;
int** pixels;
};
Image* createImage(int width, int height) {
Image* newImage = new Image;
newImage->width = width;
newImage->height = height;
newImage->pixels = new int*[height];
for (int i = 0; i < height; i++) {
newImage->pixels[i] = new int[width];
}
return newImage;
}
void destroyImage(Image* image) {
if (image == nullptr)
return;
for (int i = 0; i < image->height; i++) {
delete[] image->pixels[i];
}
delete[] image->pixels;
delete image;
}
Image* resizeImage(const Image* sourceImage, int newWidth, int newHeight) {
Image* newImage = createImage(newWidth, newHeight);
double widthRatio = static_cast<double>(sourceImage->width) / newWidth;
double heightRatio = static_cast<double>(sourceImage->height) / newHeight;
for (int y = 0; y < newHeight; y++) {
for (int x = 0; x < newWidth; x++) {
int sourceX = static_cast<int>(x * widthRatio);
int sourceY = static_cast<int>(y * heightRatio);
newImage->pixels[y][x] = sourceImage->pixels[sourceY][sourceX];
}

}
return newImage;
}
Image* rotateImage90CW(const Image* sourceImage) {
Image* newImage = createImage(sourceImage->height, sourceImage->width);
for (int y = 0; y < sourceImage->height; y++) {
for (int x = 0; x < sourceImage->width; x++) {
newImage->pixels[x][sourceImage->height - y - 1] = sourceImage->pixels[y][x];
}
}
return newImage;
}
void displayImage(const Image* image) {
for (int y = 0; y < image->height; y++) {
for (int x = 0; x < image->width; x++) {
std::cout << image->pixels[y][x] << " ";
}
std::cout << std::endl;
}
}
int main() {
Image* originalImage = createImage(4, 3);
int pixelValue = 1;
for (int y = 0; y < originalImage->height; y++) {
for (int x = 0; x < originalImage->width; x++) {
originalImage->pixels[y][x] = pixelValue++;
}
}
std::cout << "Original Image:" << std::endl;
displayImage(originalImage);
Image* resizedImage = resizeImage(originalImage, 6, 4);
std::cout << "Resized Image:" << std::endl;
displayImage(resizedImage);
Image* rotatedImage = rotateImage90CW(originalImage);
std::cout << "Rotated Image:" << std::endl;
displayImage(rotatedImage);

destroyImage(originalImage);
destroyImage(resizedImage);
destroyImage(rotatedImage);
return 0;
}
