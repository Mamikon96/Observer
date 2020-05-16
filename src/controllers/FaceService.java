package controllers;

import models.Circle;
import models.Line;
import models.Ring;
import models.Shape;
import utils.FaceConstants;

import javax.swing.*;
import java.awt.*;

public class FaceService {

    private static boolean isLeftEyeClicked = false;
    private static boolean isRightEyeClicked = false;
    private static boolean isNoseClicked = false;
    private static boolean isMouthClicked = false;

    private FaceService() {
    }

    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case (FaceConstants.LEFT_EYE):
                return getLeftEye();
            case (FaceConstants.RIGHT_EYE):
                return getRightEye();
            case (FaceConstants.NOSE):
                return getNose();
            case (FaceConstants.MOUTH):
                return getMouth();
            default:
                return null;
        }
    }

    private static Shape getLeftEye() {
        int leftEyeWidth = 100;
        int leftEyeHeight = 100;
        Shape leftEye = null;

        if (isLeftEyeClicked) {
            leftEye = new Line(0, leftEyeHeight/2, leftEyeWidth, leftEyeHeight/2);
        } else {
            leftEye = new Ring(0, 0, leftEyeWidth, leftEyeHeight, Color.WHITE);
        }

        isLeftEyeClicked = !isLeftEyeClicked;
        return leftEye;
    }

    private static Shape getRightEye() {
        int rightEyeWidth = 100;
        int rightEyeHeight = 100;
        Shape rightEye = null;

        if (isRightEyeClicked) {
            rightEye = new Line(0, rightEyeHeight/2, rightEyeWidth, rightEyeHeight/2);
        } else {
            rightEye = new Ring(0, 0, rightEyeWidth, rightEyeHeight, Color.WHITE);
        }

        isRightEyeClicked = !isRightEyeClicked;
        return rightEye;
    }

    private static Shape getNose() {
        int noseWidth = 70;
        int noseHeight = 140;
        Shape nose = null;

        if (isNoseClicked) {
            nose = new Circle(0, 0, noseWidth, noseHeight, Color.RED);
        } else {
            nose = new Circle(0, 0, noseWidth, noseHeight, Color.BLUE);
        }

        isNoseClicked = !isNoseClicked;
        return nose;
    }

    private static Shape getMouth() {
        int mouthWidth = 240;
        int mouthHeight = 100;
        Shape mouth = null;

        if (isMouthClicked) {
            mouth = new Circle(0, -mouthHeight/2, mouthWidth, mouthHeight, Color.WHITE);
        } else {
            mouth = new Circle(0, 0, mouthWidth, mouthHeight, Color.WHITE);
        }

        isMouthClicked = !isMouthClicked;
        return mouth;
    }
}
