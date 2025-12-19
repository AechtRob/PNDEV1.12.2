// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class mirasaura extends ModelBase {
	private final ModelRenderer root;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer body;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer scale1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer chest;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer neck;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer head;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer jaw;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer rightArm1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer rightArm2;
	private final ModelRenderer cube_r19;
	private final ModelRenderer rightArm3;
	private final ModelRenderer cube_r20;
	private final ModelRenderer leftArm1;
	private final ModelRenderer cube_r21;
	private final ModelRenderer leftArm2;
	private final ModelRenderer cube_r22;
	private final ModelRenderer leftArm3;
	private final ModelRenderer cube_r23;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer cube_r24;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer cube_r25;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer cube_r26;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer cube_r27;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer cube_r28;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer cube_r29;

	public mirasaura() {
		textureWidth = 64;
		textureHeight = 64;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 19.2768F, 4.5956F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.0018F, 0.9544F);
		root.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 16, -1.0F, 0.5F, 0.0F, 2, 1, 3, -0.01F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 10, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, 0.0732F, -1.8956F);
		root.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 20, -3.0F, 1.0F, -2.5F, 3, 1, 6, -0.02F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 0, -3.0F, -1.5F, -2.5F, 3, 3, 6, -0.01F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -0.7768F, -4.1456F);
		root.addChild(body);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.0F, -2.3F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0262F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 10, -1.5F, -2.0F, -2.5F, 3, 4, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 0.8216F, -5.9035F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1527F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 38, 0.0F, -2.575F, -0.05F, 1, 1, 5, 0.0F, false));

		scale1 = new ModelRenderer(this);
		scale1.setRotationPoint(0.0F, -0.6553F, -6.322F);
		body.addChild(scale1);
		setRotationAngle(scale1, 0.1745F, 0.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 6.0F, -0.5F);
		scale1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0087F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 28, -0.025F, -5.5F, 4.45F, 0, 2, 7, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.025F, -25.5F, 0.45F, 0, 20, 11, 0.0F, false));

		chest = new ModelRenderer(this);
		chest.setRotationPoint(0.0F, -0.5631F, -4.6315F);
		body.addChild(chest);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -0.9645F, -0.6762F);
		chest.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.8945F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 41, 0.0F, -0.325F, -2.0F, 1, 2, 2, 0.01F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.4631F, -1.0185F);
		chest.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0654F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -1.0F, -1.575F, -1.1F, 2, 3, 3, 0.01F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 1.1234F, -2.0302F);
		chest.addChild(neck);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.655F, -1.1101F);
		neck.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0393F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 51, -1.0F, -1.475F, 0.5F, 2, 1, 1, -0.02F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.025F, 0.805F, -1.1101F);
		neck.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.5585F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 45, -1.025F, -1.5F, -1.8F, 1, 1, 3, 0.0F, true));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 45, -0.025F, -1.5F, -1.8F, 1, 1, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.655F, -1.1101F);
		neck.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6632F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 21, -1.0F, -1.5F, -1.8F, 2, 1, 3, -0.01F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.63F, -1.1101F);
		neck.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4887F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 28, -1.0F, -0.8F, -1.975F, 2, 1, 4, -0.02F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.3412F, -1.6714F);
		neck.addChild(head);
		head.cubeList.add(new ModelBox(head, 51, 30, -1.0F, 0.5538F, -0.8417F, 2, 1, 1, 0.015F, false));
		head.cubeList.add(new ModelBox(head, 50, 34, -1.0F, 0.5538F, -2.4667F, 2, 1, 2, 0.01F, false));
		head.cubeList.add(new ModelBox(head, 53, 20, 0.2F, 0.1038F, -2.4417F, 1, 1, 1, 0.01F, false));
		head.cubeList.add(new ModelBox(head, 53, 20, -1.2F, 0.1038F, -2.4417F, 1, 1, 1, 0.01F, true));
		head.cubeList.add(new ModelBox(head, 0, 51, 0.025F, 0.1038F, -1.7917F, 1, 1, 2, 0.01F, false));
		head.cubeList.add(new ModelBox(head, 0, 51, -1.025F, 0.1038F, -1.7917F, 1, 1, 2, 0.01F, true));
		head.cubeList.add(new ModelBox(head, 0, 32, -0.5F, 0.566F, -6.0417F, 1, 1, 5, 0.02F, false));
		head.cubeList.add(new ModelBox(head, 23, 37, 0.4F, 0.766F, -5.5417F, 0, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 23, 37, -0.4F, 0.766F, -5.5417F, 0, 1, 4, 0.0F, true));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.525F, 1.066F, -4.0417F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.2182F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 10, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.525F, 1.066F, -4.0417F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 10, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.5F, -0.0702F, -2.1644F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3316F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 51, 6, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.02F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.2538F, -0.9917F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 27, 50, -1.0F, -0.45F, -1.5F, 2, 1, 2, 0.01F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 51, -1.0F, -0.45F, 0.125F, 2, 1, 1, 0.02F, false));

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 1.0538F, -0.0417F);
		head.addChild(jaw);
		setRotationAngle(jaw, -0.0262F, 0.0F, 0.0F);
		jaw.cubeList.add(new ModelBox(jaw, 53, 14, -0.5F, -0.7F, -1.4485F, 1, 1, 1, 0.0F, false));
		jaw.cubeList.add(new ModelBox(jaw, 13, 38, -0.5F, -0.1033F, -5.9488F, 1, 1, 5, 0.01F, false));
		jaw.cubeList.add(new ModelBox(jaw, 21, 38, 0.4F, -0.3033F, -5.4488F, 0, 1, 3, 0.0F, false));
		jaw.cubeList.add(new ModelBox(jaw, 21, 38, -0.4F, -0.3033F, -5.4488F, 0, 1, 3, 0.0F, true));
		jaw.cubeList.add(new ModelBox(jaw, 42, 6, -1.0F, -0.075F, -2.4F, 2, 1, 2, -0.01F, false));
		jaw.cubeList.add(new ModelBox(jaw, 36, 51, -1.0F, -0.075F, -0.8F, 2, 1, 1, -0.005F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.5F, 0.3967F, -3.9488F);
		jaw.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.192F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 51, 26, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.5F, 0.3967F, -3.9488F);
		jaw.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.192F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 26, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

		rightArm1 = new ModelRenderer(this);
		rightArm1.setRotationPoint(-0.855F, 2.056F, -0.454F);
		chest.addChild(rightArm1);
		setRotationAngle(rightArm1, -0.1125F, 0.3855F, 0.1945F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.9047F, 1.0386F, 0.639F);
		rightArm1.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.6981F, -1.2149F, 0.0188F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 32, -0.5435F, -0.6331F, -1.6786F, 1, 1, 3, 0.01F, true));

		rightArm2 = new ModelRenderer(this);
		rightArm2.setRotationPoint(-1.8681F, 1.3325F, 0.9143F);
		rightArm1.addChild(rightArm2);
		setRotationAngle(rightArm2, 0.4347F, 0.1597F, -0.3256F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.3919F, -0.079F, -0.031F);
		rightArm2.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.535F, 0.1629F, -0.0089F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 0, -0.8691F, 0.0113F, -0.4432F, 1, 3, 1, 0.0F, true));

		rightArm3 = new ModelRenderer(this);
		rightArm3.setRotationPoint(-0.0039F, 2.4084F, -1.7417F);
		rightArm2.addChild(rightArm3);
		setRotationAngle(rightArm3, 0.2508F, -0.8406F, 0.338F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.2102F, -2.496F, 1.9041F);
		rightArm3.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.535F, 0.1629F, -0.0089F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 38, -1.5433F, 3.0984F, -1.8969F, 2, 0, 2, 0.0F, true));

		leftArm1 = new ModelRenderer(this);
		leftArm1.setRotationPoint(0.855F, 2.056F, -0.454F);
		chest.addChild(leftArm1);
		setRotationAngle(leftArm1, -0.1125F, -0.3855F, -0.1945F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.9047F, 1.0386F, 0.639F);
		leftArm1.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.6981F, 1.2149F, -0.0188F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 32, -0.4565F, -0.6331F, -1.6786F, 1, 1, 3, 0.01F, false));

		leftArm2 = new ModelRenderer(this);
		leftArm2.setRotationPoint(1.8681F, 1.3325F, 0.9143F);
		leftArm1.addChild(leftArm2);
		setRotationAngle(leftArm2, 0.4347F, -0.1597F, 0.3256F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.3919F, -0.079F, -0.031F);
		leftArm2.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.535F, -0.1629F, 0.0089F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 53, 0, -0.1309F, 0.0113F, -0.4432F, 1, 3, 1, 0.0F, false));

		leftArm3 = new ModelRenderer(this);
		leftArm3.setRotationPoint(0.0039F, 2.4084F, -1.7417F);
		leftArm2.addChild(leftArm3);
		setRotationAngle(leftArm3, 0.2508F, 0.8406F, -0.338F);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.2102F, -2.496F, 1.9041F);
		leftArm3.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.535F, -0.1629F, 0.0089F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 38, -0.4567F, 3.0984F, -1.8969F, 2, 0, 2, 0.0F, false));

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -0.1726F, 4.018F);
		root.addChild(tail1);
		setRotationAngle(tail1, -0.1745F, 0.0F, 0.0F);
		tail1.cubeList.add(new ModelBox(tail1, 38, 46, -0.825F, -0.205F, 0.01F, 1, 1, 3, 0.0F, false));
		tail1.cubeList.add(new ModelBox(tail1, 0, 46, -0.825F, 0.445F, 0.01F, 1, 1, 3, -0.01F, false));
		tail1.cubeList.add(new ModelBox(tail1, 47, 46, -0.175F, -0.2F, 0.0F, 1, 1, 3, 0.0F, false));
		tail1.cubeList.add(new ModelBox(tail1, 9, 50, -0.175F, 0.45F, 0.0F, 1, 1, 3, -0.01F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.551F, 2.8736F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, -0.1222F, 0.0F, 0.0F);
		tail2.cubeList.add(new ModelBox(tail2, 39, 40, -0.5F, -0.5F, -0.1F, 1, 1, 4, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0162F, 3.7518F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.2182F, 0.0F, 0.0F);
		tail3.cubeList.add(new ModelBox(tail3, 39, 34, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.01F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0048F, 3.7482F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, 0.2618F, 0.0F, 0.0F);
		tail4.cubeList.add(new ModelBox(tail4, 42, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setRotationPoint(-0.9947F, -0.1868F, 2.3537F);
		root.addChild(rightLeg1);
		setRotationAngle(rightLeg1, -0.7915F, 0.089F, -0.4511F);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.3008F, 1.1202F, -0.2607F);
		rightLeg1.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.6166F, 0.1669F, 0.7799F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 45, -1.0F, -1.147F, -1.0553F, 1, 1, 3, 0.0F, true));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 45, -1.0F, -0.622F, -1.0553F, 1, 1, 3, 0.01F, true));

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setRotationPoint(-2.0196F, 2.104F, -0.4351F);
		rightLeg1.addChild(rightLeg2);
		setRotationAngle(rightLeg2, 0.3491F, 0.0076F, 0.542F);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.3862F, -0.5035F, 0.5429F);
		rightLeg2.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.2347F, 0.2082F, 0.1967F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 50, -0.6125F, -0.1193F, 0.2067F, 1, 1, 3, 0.0F, true));

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setRotationPoint(-0.2211F, 2.5696F, 1.2713F);
		rightLeg2.addChild(rightLeg3);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.0581F, 0.1728F, -0.5556F);
		rightLeg3.addChild(cube_r26);
		setRotationAngle(cube_r26, -1.2249F, -0.3442F, -0.0972F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 53, 17, -1.5436F, -0.5588F, -0.0098F, 2, 2, 0, 0.0F, true));

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setRotationPoint(0.9947F, -0.1868F, 2.3537F);
		root.addChild(leftLeg1);
		setRotationAngle(leftLeg1, -0.7915F, -0.089F, 0.4511F);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.3008F, 1.1202F, -0.2607F);
		leftLeg1.addChild(cube_r27);
		setRotationAngle(cube_r27, -1.6166F, -0.1669F, -0.7799F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 45, 0.0F, -1.147F, -1.0553F, 1, 1, 3, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 11, 45, 0.0F, -0.622F, -1.0553F, 1, 1, 3, 0.01F, false));

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setRotationPoint(2.0196F, 2.104F, -0.4351F);
		leftLeg1.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 0.3491F, -0.0076F, -0.542F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.3862F, -0.5035F, 0.5429F);
		leftLeg2.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.2347F, -0.2082F, -0.1967F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 50, -0.3875F, -0.1193F, 0.2067F, 1, 1, 3, 0.0F, false));

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setRotationPoint(0.2211F, 2.5696F, 1.2713F);
		leftLeg2.addChild(leftLeg3);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0581F, 0.1728F, -0.5556F);
		leftLeg3.addChild(cube_r29);
		setRotationAngle(cube_r29, -1.2249F, 0.3442F, 0.0972F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 53, 17, -0.4564F, -0.5588F, -0.0098F, 2, 2, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		root.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}