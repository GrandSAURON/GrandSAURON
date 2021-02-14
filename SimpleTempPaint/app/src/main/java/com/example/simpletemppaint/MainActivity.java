package com.example.simpletemppaint;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Draw2D(this));
    }

    public class Draw2D extends View {
        private Paint mPaint = new Paint();
        private Bitmap mBitmap;
        public Draw2D(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = canvas.getWidth();
            int height = canvas.getHeight();

            mPaint.setStyle(Paint.Style.FILL);

            mPaint.setColor(Color.WHITE);
            canvas.drawPaint(mPaint);

            mPaint.setAntiAlias(true);
            mPaint.setColor(Color.YELLOW);
            canvas.drawCircle(50, 500, 70, mPaint);

            mPaint.setColor(Color.GREEN);
            mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawRect(0, canvas.getHeight() - 800, width, height, mPaint);

            mPaint.setColor(Color.YELLOW);
            mPaint.setStrokeWidth(10);
            canvas.drawLine(50,500,200,650, mPaint);
            canvas.drawLine(50,500,250,450, mPaint);
            canvas.drawLine(50,500,250,550, mPaint);
            canvas.drawLine(50,500,60,700, mPaint);
            canvas.drawLine(50,500,150,350, mPaint);

            mPaint.setColor(Color.rgb(65,25,0));
            RectF rect = new RectF(650, 1000, 700, 1400);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, mPaint);

            mPaint.setColor(Color.rgb(65,75,0));
            RectF oval3 = new RectF(800, 750, 550, 1200);
            canvas.drawOval(oval3, mPaint);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setColor(Color.BLACK);
            mPaint.setStrokeWidth(3);
            RectF oval4 = new RectF(800, 750, 550, 1200);
            canvas.drawOval(oval4, mPaint);

            mPaint.setColor(Color.rgb(53,9,0));
            RectF rectHouse = new RectF(10, 1000, 400, 1400);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rectHouse, mPaint);

            Paint paint = new Paint();
            paint.setColor(Color.rgb(53,9,0));
            paint.setStrokeWidth(10);
            paint.setStyle(Paint.Style.FILL);
            Path path = new Path();
            path.moveTo(10, 1000);
            path.lineTo(220,700);
            path.lineTo(400,1000);
            canvas.drawPath(path,paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(5);
            path.lineTo(10,1000);
            canvas.drawPath(path,paint);

            mPaint.setAntiAlias(true);
            mPaint.setColor(Color.YELLOW);
            canvas.drawCircle(50, 500, 70, mPaint);

            mPaint.setColor(Color.rgb(89,9,0));
            RectF rectDoor = new RectF(240, 1100, 350, 1400);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rectDoor, mPaint);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setColor(Color.BLACK);
            mPaint.setStrokeWidth(3);
            RectF rectDoor1 = new RectF(240, 1100, 350, 1400);
            canvas.drawRect(rectDoor1, mPaint);

            mPaint.setColor(Color.YELLOW);
            RectF rectWind = new RectF(60, 1150, 160, 1250);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rectWind, mPaint);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setColor(Color.BLACK);
            mPaint.setStrokeWidth(3);
            RectF rectWind1 = new RectF(60, 1150, 160, 1250);
            canvas.drawRect(rectWind1, mPaint);
        }
    }
}