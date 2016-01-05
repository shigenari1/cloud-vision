/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-02-04 at 16:40:17 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.vision.v1.model;

/**
 * A face annotation contains the results of face detection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FaceAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Anger likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String angerLikelihood;

  /**
   * Blurred likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blurredLikelihood;

  /**
   * The bounding polygon around the face. The coordinates of the bounding box are in the original
   * image's scale, as returned in ImageParams. The bounding box is computed to "frame" the face in
   * accordance with human expectations. It is based on the landmarker results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BoundingPoly boundingPoly;

  /**
   * Detection confidence. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float detectionConfidence;

  /**
   * This bounding polygon is tighter than the previous boundingPoly, and encloses only the skin
   * part of the face. Typically, it is used to eliminate the face from any image analysis that
   * detects the "amount of skin" visible in an image. It is not based on the landmarker results,
   * only on the initial face detection, hence the fd (face detection) prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BoundingPoly fdBoundingPoly;

  /**
   * Headwear likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headwearLikelihood;

  /**
   * Joy likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String joyLikelihood;

  /**
   * Face landmarking confidence. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float landmarkingConfidence;

  /**
   * Detected face landmarks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Landmark> landmarks;

  /**
   * Yaw angle. Indicates the leftward/rightward angle that the face is pointing, relative to the
   * vertical plane perpendicular to the image. Range [-180,180].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float panAngle;

  /**
   * Roll angle. Indicates the amount of clockwise/anti-clockwise rotation of the face relative to
   * the image vertical, about the axis perpendicular to the face. Range [-180,180].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float rollAngle;

  /**
   * Sorrow likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sorrowLikelihood;

  /**
   * Surprise likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String surpriseLikelihood;

  /**
   * Pitch angle. Indicates the upwards/downwards angle that the face is pointing relative to the
   * image's horizontal plane. Range [-180,180].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float tiltAngle;

  /**
   * Under-exposed likelihood.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String underExposedLikelihood;

  /**
   * Anger likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getAngerLikelihood() {
    return angerLikelihood;
  }

  /**
   * Anger likelihood.
   * @param angerLikelihood angerLikelihood or {@code null} for none
   */
  public FaceAnnotation setAngerLikelihood(java.lang.String angerLikelihood) {
    this.angerLikelihood = angerLikelihood;
    return this;
  }

  /**
   * Blurred likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getBlurredLikelihood() {
    return blurredLikelihood;
  }

  /**
   * Blurred likelihood.
   * @param blurredLikelihood blurredLikelihood or {@code null} for none
   */
  public FaceAnnotation setBlurredLikelihood(java.lang.String blurredLikelihood) {
    this.blurredLikelihood = blurredLikelihood;
    return this;
  }

  /**
   * The bounding polygon around the face. The coordinates of the bounding box are in the original
   * image's scale, as returned in ImageParams. The bounding box is computed to "frame" the face in
   * accordance with human expectations. It is based on the landmarker results.
   * @return value or {@code null} for none
   */
  public BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * The bounding polygon around the face. The coordinates of the bounding box are in the original
   * image's scale, as returned in ImageParams. The bounding box is computed to "frame" the face in
   * accordance with human expectations. It is based on the landmarker results.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public FaceAnnotation setBoundingPoly(BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * Detection confidence. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getDetectionConfidence() {
    return detectionConfidence;
  }

  /**
   * Detection confidence. Range [0, 1].
   * @param detectionConfidence detectionConfidence or {@code null} for none
   */
  public FaceAnnotation setDetectionConfidence(java.lang.Float detectionConfidence) {
    this.detectionConfidence = detectionConfidence;
    return this;
  }

  /**
   * This bounding polygon is tighter than the previous boundingPoly, and encloses only the skin
   * part of the face. Typically, it is used to eliminate the face from any image analysis that
   * detects the "amount of skin" visible in an image. It is not based on the landmarker results,
   * only on the initial face detection, hence the fd (face detection) prefix.
   * @return value or {@code null} for none
   */
  public BoundingPoly getFdBoundingPoly() {
    return fdBoundingPoly;
  }

  /**
   * This bounding polygon is tighter than the previous boundingPoly, and encloses only the skin
   * part of the face. Typically, it is used to eliminate the face from any image analysis that
   * detects the "amount of skin" visible in an image. It is not based on the landmarker results,
   * only on the initial face detection, hence the fd (face detection) prefix.
   * @param fdBoundingPoly fdBoundingPoly or {@code null} for none
   */
  public FaceAnnotation setFdBoundingPoly(BoundingPoly fdBoundingPoly) {
    this.fdBoundingPoly = fdBoundingPoly;
    return this;
  }

  /**
   * Headwear likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadwearLikelihood() {
    return headwearLikelihood;
  }

  /**
   * Headwear likelihood.
   * @param headwearLikelihood headwearLikelihood or {@code null} for none
   */
  public FaceAnnotation setHeadwearLikelihood(java.lang.String headwearLikelihood) {
    this.headwearLikelihood = headwearLikelihood;
    return this;
  }

  /**
   * Joy likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getJoyLikelihood() {
    return joyLikelihood;
  }

  /**
   * Joy likelihood.
   * @param joyLikelihood joyLikelihood or {@code null} for none
   */
  public FaceAnnotation setJoyLikelihood(java.lang.String joyLikelihood) {
    this.joyLikelihood = joyLikelihood;
    return this;
  }

  /**
   * Face landmarking confidence. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getLandmarkingConfidence() {
    return landmarkingConfidence;
  }

  /**
   * Face landmarking confidence. Range [0, 1].
   * @param landmarkingConfidence landmarkingConfidence or {@code null} for none
   */
  public FaceAnnotation setLandmarkingConfidence(java.lang.Float landmarkingConfidence) {
    this.landmarkingConfidence = landmarkingConfidence;
    return this;
  }

  /**
   * Detected face landmarks.
   * @return value or {@code null} for none
   */
  public java.util.List<Landmark> getLandmarks() {
    return landmarks;
  }

  /**
   * Detected face landmarks.
   * @param landmarks landmarks or {@code null} for none
   */
  public FaceAnnotation setLandmarks(java.util.List<Landmark> landmarks) {
    this.landmarks = landmarks;
    return this;
  }

  /**
   * Yaw angle. Indicates the leftward/rightward angle that the face is pointing, relative to the
   * vertical plane perpendicular to the image. Range [-180,180].
   * @return value or {@code null} for none
   */
  public java.lang.Float getPanAngle() {
    return panAngle;
  }

  /**
   * Yaw angle. Indicates the leftward/rightward angle that the face is pointing, relative to the
   * vertical plane perpendicular to the image. Range [-180,180].
   * @param panAngle panAngle or {@code null} for none
   */
  public FaceAnnotation setPanAngle(java.lang.Float panAngle) {
    this.panAngle = panAngle;
    return this;
  }

  /**
   * Roll angle. Indicates the amount of clockwise/anti-clockwise rotation of the face relative to
   * the image vertical, about the axis perpendicular to the face. Range [-180,180].
   * @return value or {@code null} for none
   */
  public java.lang.Float getRollAngle() {
    return rollAngle;
  }

  /**
   * Roll angle. Indicates the amount of clockwise/anti-clockwise rotation of the face relative to
   * the image vertical, about the axis perpendicular to the face. Range [-180,180].
   * @param rollAngle rollAngle or {@code null} for none
   */
  public FaceAnnotation setRollAngle(java.lang.Float rollAngle) {
    this.rollAngle = rollAngle;
    return this;
  }

  /**
   * Sorrow likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getSorrowLikelihood() {
    return sorrowLikelihood;
  }

  /**
   * Sorrow likelihood.
   * @param sorrowLikelihood sorrowLikelihood or {@code null} for none
   */
  public FaceAnnotation setSorrowLikelihood(java.lang.String sorrowLikelihood) {
    this.sorrowLikelihood = sorrowLikelihood;
    return this;
  }

  /**
   * Surprise likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getSurpriseLikelihood() {
    return surpriseLikelihood;
  }

  /**
   * Surprise likelihood.
   * @param surpriseLikelihood surpriseLikelihood or {@code null} for none
   */
  public FaceAnnotation setSurpriseLikelihood(java.lang.String surpriseLikelihood) {
    this.surpriseLikelihood = surpriseLikelihood;
    return this;
  }

  /**
   * Pitch angle. Indicates the upwards/downwards angle that the face is pointing relative to the
   * image's horizontal plane. Range [-180,180].
   * @return value or {@code null} for none
   */
  public java.lang.Float getTiltAngle() {
    return tiltAngle;
  }

  /**
   * Pitch angle. Indicates the upwards/downwards angle that the face is pointing relative to the
   * image's horizontal plane. Range [-180,180].
   * @param tiltAngle tiltAngle or {@code null} for none
   */
  public FaceAnnotation setTiltAngle(java.lang.Float tiltAngle) {
    this.tiltAngle = tiltAngle;
    return this;
  }

  /**
   * Under-exposed likelihood.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnderExposedLikelihood() {
    return underExposedLikelihood;
  }

  /**
   * Under-exposed likelihood.
   * @param underExposedLikelihood underExposedLikelihood or {@code null} for none
   */
  public FaceAnnotation setUnderExposedLikelihood(java.lang.String underExposedLikelihood) {
    this.underExposedLikelihood = underExposedLikelihood;
    return this;
  }

  @Override
  public FaceAnnotation set(String fieldName, Object value) {
    return (FaceAnnotation) super.set(fieldName, value);
  }

  @Override
  public FaceAnnotation clone() {
    return (FaceAnnotation) super.clone();
  }

}
