/*
 * Copyright
 */

package org.germalus.frontend.gwt.startpage.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.user.client.ui.RootPanel;
import org.germalus.frontend.gwt.startpage.client.main.MainView;

/**
 * Start point in the front end application.
 *
 * @since 0.0.1
 */
public final class StartPoint implements EntryPoint {

    /**
     * Injector field.
     */
    private final Injection injection;

    /**
     * Constructor. Create an injector.
     */
    public StartPoint() {
        this.injection = GWT.create(Injection.class);
    }

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(this.injection.getMainView().init());
    }

    /**
     * Injector interface.
     *
     * @since 0.0.1
     */
    public interface Injection extends Ginjector {
        /**
         * Create a main view.
         *
         * @return Main view.
         */
        MainView getMainView();
    }
}
