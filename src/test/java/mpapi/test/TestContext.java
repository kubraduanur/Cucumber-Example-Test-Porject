package mpapi.test;

public final class TestContext {

    public static final ThreadLocal<TestContext> contexts = new ThreadLocal<>();
    private TestContext initializedContext;

    private TestContext() {
    }

    public static TestContext get() {
        return contexts.get();
    }

    public static TestContext init() {
        TestContext context = new TestContext();
        contexts.set(context);

        context.setContexts(contexts.get());
        return context;
    }

    public static void remove() {
        contexts.remove();
    }



    private void setContexts(TestContext initializedContext) {
        this.initializedContext = initializedContext;
    }

    private TestContext getContext() {
        return this.initializedContext;
    }


}