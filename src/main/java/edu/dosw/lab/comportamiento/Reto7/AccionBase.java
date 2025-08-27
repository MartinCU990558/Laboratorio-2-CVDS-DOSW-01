package edu.dosw.lab.comportamiento.Reto7;
public abstract class AccionBase implements Command {

        protected String usuario;
        protected boolean deshacer = false;

        public AccionBase(String usuario) {
            this.usuario = usuario;
        }
        @Override
        public String getUser() {
            return usuario;
        }
        @Override
        public void undo() {
            deshacer = true;
        }
        @Override
        public boolean isUndone() {
            return deshacer;
        }
    }


