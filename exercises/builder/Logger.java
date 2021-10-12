package exercises.builder;

import java.time.LocalDateTime;

public class Logger {
    private String prefix;
    private String postfix;
    private boolean includesTime;

    public Logger(Builder builder) {
        this.prefix = builder.prefix;
        this.postfix = builder.postfix;
        this.includesTime = builder.includesTime;
    }


    public void log(String message) {
        if (prefix != null) message = prefix + " " + message;
        if (postfix != null) message = message + " " + postfix;
        if (includesTime) message = "[" + LocalDateTime.now() + "] " + message;
        System.out.println(message);
    }

    static class Builder {
        public String prefix = "";
        public String postfix = "";
        public boolean includesTime = false;

        public Builder withPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder withPostfix(String postfix) {
            this.postfix = postfix;
            return this;
        }

        public Builder includesTime(Boolean includesTime) {
            this.includesTime = includesTime;
            return this;
        }

        public Logger build() {
            return new Logger(this);
        }
    }
}

