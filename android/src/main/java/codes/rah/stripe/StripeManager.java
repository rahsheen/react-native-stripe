package codes.rah.stripe;

import android.view.View;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.stripe.android.view.CardInputWidget;

public class StripeManager extends SimpleViewManager<CardInputWidget> {

    public static final String REACT_CLASS = "CardInput";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CardInputWidget createViewInstance(ThemedReactContext c) {
        return new CardInputWidget(context);
    }
}
