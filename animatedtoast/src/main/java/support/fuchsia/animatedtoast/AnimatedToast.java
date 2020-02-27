package support.fuchsia.animatedtoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class AnimatedToast extends View {

    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;

    public static final int SUCCESS = 1;
    public static final int WARNING = 2;
    public static final int FAILURE = 3;
    public static final int INFO = 4;
    public static final int CUSTUM = 5;

    public static int TOP = 1;
    public static int CENTER = 2;
    public static int BOTTOM = 3;

    public static String DEFAULTTOAST = "DEFAULT";
    public static String SUCCESSTOAST = "SUCCESS";
    public static String FAILTOAST = "FAIL";
    public static String WARNINGTOAST = "WARN";
    public static String INFOTOAST = "INFO";
    public static String CUSTOMTOAST = "CUSTOM";

    static Toast toast;
    static LottieAnimationView toast_image;
    static View layout;
    static TypeWriter text;

    public AnimatedToast(Context context) {
        super(context);
    }

    public static class makeToast {

        private Context context;
        private int duration;
        private int gravity;
        private int style;
        private String backgroundcolor;
        private String message;
        LinearLayout background_ln;


        public makeToast(Context context, String message, int duration) {

            this.context = context;
            this.message = message;
            this.duration = duration;

        }

        public makeToast(Context context, String message, int duration, int style) {

            this.context = context;
            this.message = message;
            this.duration = duration;
            this.style = style;

        }

        public makeToast(Context context, String message, int duration, int style, int gravity) {

            this.context = context;
            this.message = message;
            this.duration = duration;
            this.style = style;
            this.gravity = gravity;

        }

        public makeToast(Context context, String message, int duration, int style, int gravity, String backgroundcolor) {

            this.context = context;
            this.message = message;
            this.duration = duration;
            this.style = style;
            this.backgroundcolor = backgroundcolor;
            this.gravity = gravity;

        }

        public void setStyle(int style, LinearLayout background, LottieAnimationView lottieAnimationView) {

            switch (style) {

                case SUCCESS:
                    toast_image.setAnimation("success_toast.json");
                    customView(background, Color.parseColor("#00C853"));
                    break;

                case WARNING:
                    toast_image.setAnimation("warning_toast.json");
                    customView(background, Color.parseColor("#FF6D00"));
                    break;

                case FAILURE:
                    toast_image.setAnimation("failure_toast.json");
                    customView(background, Color.parseColor("#d50000"));
                    break;

                case INFO:
                    toast_image.setAnimation("info_toast.json");
                    customView(background, Color.parseColor("#0091EA"));
                    break;

                case CUSTUM:
                    toast_image.setAnimation("info_toast.json");
                    customView(background, Color.parseColor((backgroundcolor)));
                    break;

                default:
                    toast_image.setAnimation("info_toast.json");
                    customView(background, Color.parseColor("#0091EA"));

            }

        }

        public void setGravity(int gravity, Toast toast) {

            switch (gravity) {

                case 1:
                    toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 20);
                    break;

                case 2:
                    toast.setGravity(Gravity.CENTER | Gravity.FILL_HORIZONTAL, 0, 0);
                    break;

                case 3:
                    toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 20);
                    break;

                default:
                    toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0);
                    break;

            }

        }

        public void show() {

            if (toast != null) {
                try {
                    toast.cancel();
                } catch (Exception e) {
                }
            }

            toast = new Toast(context);

            layout = LayoutInflater.from(context).inflate(R.layout.toast_animated, null, false);

            text = layout.findViewById(R.id.toast_txt);
            toast_image = layout.findViewById(R.id.toast_image);
            background_ln = layout.findViewById(R.id.toast_color_layout);

            setStyle(style, background_ln, toast_image);
            setGravity(gravity, toast);
            text.setCharacterDelay(20);
            text.animateText(message);
            toast.setDuration(duration);
            toast.setView(layout);
            toast.show();

        }

    }

    private static void customView(View v, int backgroundColor) {

        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setCornerRadii(new float[]{20, 20, 20, 20, 20, 20, 20, 20});
        shape.setColor(backgroundColor);
        shape.setStroke(3, backgroundColor);
        v.setBackground(shape);

    }

}





