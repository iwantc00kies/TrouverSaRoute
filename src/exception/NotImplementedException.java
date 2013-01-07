package exception;

import java.io.PrintWriter;

/** Exception indiquant qu'une fonctionnalite n'a pas encore ete implementee
 */
public class NotImplementedException extends UnsupportedOperationException{

	/**
	 * Required for serialization support.
	 * 
	 * @see java.io.Serializable
	 */
	private static final long serialVersionUID = 2732148255968700843L;

	private static final String DEFAULT_MESSAGE = "Fonctionnalité pas implementée";


	/** l'exception ayant cause cette exception */
	private Throwable cause;



	/** Constructeur avec un message par defaut  */
	public NotImplementedException() {
		super(DEFAULT_MESSAGE);
	}

	/** Constructeur avec un message detaille
	 * @param msg  le message d'erreur
	 */
	public NotImplementedException(String msg) {
		super(msg == null ? DEFAULT_MESSAGE : msg);
	}

	/**
	 * Constructeur avec l'exception qui est la cause de cette exception
	 * @param cause  	l'exception eventuelle qui a cause cette exception
	 */
	public NotImplementedException(Throwable cause) {
		super(DEFAULT_MESSAGE);
		this.cause = cause;
	}

	/**
	 * Constructeur avec un message detaille et l'exception qui est la cause de cette exception
	 * @param msg   	le message d'erreur associe a l'exception
	 * @param cause  	l'exception eventuelle qui a cause cette exception
	 */
	public NotImplementedException(String msg, Throwable cause) {
		super(msg == null ? DEFAULT_MESSAGE : msg);
		this.cause = cause;
	}


	/**
	 * Constructeur ciblant la classe incomplete
	 * @param c 		la classe ayant la methode not implementee
	 */
	public NotImplementedException(@SuppressWarnings("rawtypes") Class c) {
		super(c == null ? DEFAULT_MESSAGE : DEFAULT_MESSAGE + " in " + c);
	}


	/**
	 * renvoie la cause de l'exception
	 * @return 			la cause premiere de l'exception
	 */
	public Throwable getCause() {
		return cause;
	}


	/**
	 * Renvoie tous les messages d'erreur imbriques
	 *
	 * @return 		le message d'erreur
	 */
	public String getMessage() {
		if (super.getMessage() != null) {
			return super.getMessage();
		} else if (cause != null) {
			return cause.toString();
		} else {
			return null;
		}
	}


	/**
	 * Affiche la pile d'appels de cette exception
	 */
	public final void printPartialStackTrace(PrintWriter out) {
		super.printStackTrace(out);
	}



}