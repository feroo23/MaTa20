package Matrizen;

public class JanniksProblemAufgabe {

	public static void main(String[] args) {

		int[][][][][][][][][][][][][][][][][][][][] problem = new int[2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2][2];

		boolean ab = true;

		do {

			for (int i = 0; i < problem.length; i++) {
				for (int j = 0; j < problem[i].length; j++) {
					for (int j2 = 0; j2 < problem[i].length; j2++) {
						for (int k = 0; k < problem[i].length; k++) {
							for (int l = 0; l < problem[i].length; l++) {
								for (int l2 = 0; l2 < problem[i].length; l2++) {
									for (int m = 0; m < problem[i].length; m++) {
										for (int m2 = 0; m2 < problem[i].length; m2++) {
											for (int n = 0; n < problem[i].length; n++) {
												for (int n2 = 0; n2 < problem[i].length; n2++) {
													for (int o = 0; o < problem[i].length; o++) {
														for (int o2 = 0; o2 < problem[i].length; o2++) {
															for (int p = 0; p < problem[i].length; p++) {
																for (int p2 = 0; p2 < problem[i].length; p2++) {
																	for (int q = 0; q < problem[i].length; q++) {
																		for (int q2 = 0; q2 < problem[i].length; q2++) {
																			for (int r = 0; r < problem[i].length; r++) {
																				for (int r2 = 0; r2 < problem[i].length; r2++) {
																					for (int s = 0; s < problem[i].length; s++) {
																						for (int s2 = 0; s2 < problem[i].length; s2++) {
																							problem[i][j][j2][k][l][l2][m][m2][n][n2][o][o2][p][p2][q][q2][r][r2][s][s2] = (int) (Math.random() * 1000); 
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			for (int i = 0; i < problem.length; i++) {
				for (int j = 0; j < problem.length; j++) {
					for (int j2 = 0; j2 < problem.length; j2++) {
						for (int k = 0; k < problem.length; k++) {
							for (int l = 0; l < problem.length; l++) {
								for (int l2 = 0; l2 < problem.length; l2++) {
									for (int m = 0; m < problem.length; m++) {
										for (int m2 = 0; m2 < problem.length; m2++) {
											for (int n = 0; n < problem.length; n++) {
												for (int n2 = 0; n2 < problem.length; n2++) {
													for (int o = 0; o < problem.length; o++) {
														for (int o2 = 0; o2 < problem.length; o2++) {
															for (int p = 0; p < problem.length; p++) {
																for (int p2 = 0; p2 < problem.length; p2++) {
																	for (int q = 0; q < problem.length; q++) {
																		for (int q2 = 0; q2 < problem.length; q2++) {
																			for (int r = 0; r < problem.length; r++) {
																				for (int r2 = 0; r2 < problem.length; r2++) {
																					for (int s = 0; s < problem.length; s++) {
																						for (int s2 = 0; s2 < problem.length; s2++) {
																							System.out.println("Der Array an der Stelle [" + i + "][" + j + "][" + j2 + "][" + k + "][" + l + "][" + l2 + "][" + m + "][" + m2 + "][" + n + "][" + n2 + "][" + o + "][" + o2 + "][" + p + "][" + p2 + "][" + q + "][" + q2 + "][" + r + "][" + r2 + "][" + s + "][" + s2 + "]  hat den Wert =====>" + problem[i][j][j2][k][l][l2][m][m2][n][n2][o][o2][p][p2][q][q2][r][r2][s][s2]); 
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}while (ab);


	}
	
}


