package com.example.damian.kinematicscalculationvs2.openGL.objects;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Damian on 2016-10-04.
 */

public class Yaxis extends ObjectParent {

    public Yaxis(float length) {

//        verticles = new float[]{
//                -0.5f, -0.5f, -0.5f,  // 0. left-bottom-front
//                0.5f, -0.5f, -0.5f,  // 1. right-bottom-front
//                -0.5f, -0.5f, 0.5f+length,  // 2. left-top-front
//                0.5f, -0.5f, 0.5f+length,  // 3. right-top-front
//                0.5f, 0.5f, -0.5f,  // 6. right-bottom-back
//                -0.5f, 0.5f, -0.5f,  // 4. left-bottom-back
//                0.5f, 0.5f, 0.5f+length,  // 7. right-top-back
//                -0.5f, 0.5f, 0.5f+length,  // 5. left-top-back
//        };

        verticles = new float[]{
                -0.1f, -0.1f, 0.1f,  // 0. left-bottom-front
                0.1f, -0.1f, 0.1f,  // 1. right-bottom-front
                -0.1f, 0.1f+length, 0.1f,  // 2. left-top-front
                0.1f, 0.1f+length, 0.1f ,  // 3. right-top-front
                0.1f, -0.1f, -0.1f,  // 6. right-bottom-back
                -0.1f, -0.1f, -0.1f,  // 4. left-bottom-back
                0.1f, 0.1f+length, -0.1f,  // 7. right-top-back
                -0.1f, 0.1f+length, -0.1f,  // 5. left-top-back
        };

        indices = new byte[]{
                0, 1, 2,
                2, 1, 3,

                4, 5, 6,
                6, 5, 7,

                4, 0, 5,
                0, 4, 1,

                1, 6, 3,
                1, 4, 6,

                0, 2, 5,
                7, 5, 2,

                2, 3, 6,
                2, 6, 7
        };
    }

    public float[] getVerticles() {

        return verticles;
    }

    @Override
    protected void constructor() {

    }

    @Override
    protected void drawing(GL10 gl) {
        gl.glColor4f(colors[2][0], colors[2][1], colors[2][2], colors[2][3]);
    }

}
