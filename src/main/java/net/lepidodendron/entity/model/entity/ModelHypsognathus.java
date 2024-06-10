package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypsognathus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHypsognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hypsognathus;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer backrightleg5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backrightleg6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontrightleg4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer frontrightleg5;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer frontrightleg6;
    private final AdvancedModelRenderer cube_r32;

    private ModelAnimator animator;

    public ModelHypsognathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Hypsognathus = new AdvancedModelRenderer(this);
        this.Hypsognathus.setRotationPoint(-0.5F, 23.0F, 0.0F);


        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.5F, -5.5F, -7.0F);
        this.Hypsognathus.addChild(lowerbody);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 0, -5.0F, 0.0F, 1.0F, 10, 6, 9, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 9.0F);
        this.lowerbody.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 15, -3.5F, -0.5F, 0.0F, 7, 5, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.3843F, 2.8708F, 1.6212F);
        this.tail.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, -0.9163F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.2481F, 0.6497F, -1.1269F);
        this.backleftleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -3.0844F, -0.4375F, 3.0728F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 36, -2.0F, -1.75F, -2.0F, 4, 2, 3, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.6369F, 0.4902F, -1.7293F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, 0.2618F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1667F, 0.5755F, 0.1585F);
        this.backleftleg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.01F, 0.075F, -0.0077F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, -0.75F, -1.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.5713F, 1.9814F, 0.256F);
        this.backleftleg2.addChild(backleftleg3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3868F, 0.0541F, 1.0286F);
        this.backleftleg3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0336F, 0.075F, -0.0077F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 15, -1.7752F, 0.03F, -5.9914F, 4, 0, 6, -0.01F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-3.3843F, 2.8708F, 1.8712F);
        this.tail.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.1309F, 0.1309F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.2481F, 0.6497F, -1.1269F);
        this.backrightleg4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -3.0844F, 0.4375F, -3.0728F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 36, -2.0F, -1.75F, -2.0F, 4, 2, 3, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRenderer(this);
        this.backrightleg5.setRotationPoint(-2.6369F, 0.4902F, -1.4793F);
        this.backrightleg4.addChild(backrightleg5);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1667F, 0.5755F, -0.0915F);
        this.backrightleg5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.01F, -0.075F, 0.0077F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 42, -1.25F, -1.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.backrightleg6 = new AdvancedModelRenderer(this);
        this.backrightleg6.setRotationPoint(-0.5713F, 1.9814F, 0.006F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.1309F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3868F, 0.0541F, 1.0286F);
        this.backrightleg6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0336F, -0.075F, 0.0077F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 15, -2.2248F, 0.03F, -5.9914F, 4, 0, 6, -0.01F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -2.0F, -0.5158F, -1.1386F, 4, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4842F, 3.8614F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 24, -1.0F, -0.4564F, -0.999F, 2, 3, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.0436F, 4.001F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 12, 35, -0.5F, -1.0872F, -0.9981F, 1, 2, 6, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Hypsognathus.addChild(upperbody);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 19, 21, -3.5F, -1.5F, -2.0F, 8, 5, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 4.5F, 1.0F);
        this.upperbody.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 33, -3.0F, -1.0F, -3.0F, 6, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.upperbody.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 3, 47, -2.5F, -1.5F, -4.0F, 6, 4, 4, -0.011F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.4904F, 1.7769F, -4.7802F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0828F, 0.482F, -0.5199F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 7, -2.75F, -0.75F, 1.5F, 3, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.4904F, 1.7769F, -4.7802F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0828F, -0.482F, 0.5199F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 7, -0.25F, -0.75F, 1.5F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 3.0F, -2.5F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 17, -2.5F, -1.5F, -0.5F, 5, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.54F, -0.1527F, -3.0194F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 18, 29, -3.04F, -1.3473F, -2.9806F, 6, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 33, 32, -3.04F, 1.6527F, -2.4806F, 6, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0303F, 1.9296F, -1.0108F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0696F, 0.0474F, -0.208F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 37, -1.25F, -1.25F, 0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.9504F, 1.9296F, -1.0108F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0696F, -0.0474F, 0.208F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 37, -1.75F, -1.25F, 0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.54F, 2.1527F, -1.9806F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0666F, -0.2079F, -0.3124F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 41, -1.0F, -0.5F, 0.25F, 3, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.46F, 2.1527F, -1.9806F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0666F, 0.2079F, 0.3124F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 41, -2.0F, -0.5F, 0.25F, 3, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.04F, 0.6527F, -1.4806F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.7418F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 5, 0, 0.25F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.96F, 0.6527F, -1.4806F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.7418F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 0, -1.25F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.3856F, 1.0866F, -3.2139F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2808F, -0.2724F, -0.375F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 24, -0.75F, -0.25F, 0.25F, 2, 1, 1, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.3057F, 1.0866F, -3.2139F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2808F, 0.2724F, 0.375F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 24, -1.25F, -0.25F, 0.25F, 2, 1, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.04F, -0.7605F, -4.223F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 7, -1.5F, 0.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.61F, 2.0529F, -5.1619F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 46, -0.5F, -0.0076F, -0.0868F, 1, 1, 0, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 46, -1.8F, -0.0076F, -0.0868F, 1, 1, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.04F, 0.6016F, -3.3424F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1855F, -0.3435F, -0.0631F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.25F, -0.8889F, -2.0F, 1, 2, 3, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.96F, 0.6016F, -3.3424F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1855F, 0.3435F, 0.0631F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.75F, -0.8889F, -2.0F, 1, 2, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.04F, -0.8473F, -3.7306F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 37, -1.5F, 0.6F, -2.0F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.04F, 1.4027F, -2.2306F);
        this.head.addChild(jaw);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.25F, -1.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 21, -2.0F, 1.75F, 0.15F, 4, 1, 2, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 35, -1.5F, 2.6F, -2.0F, 3, 1, 4, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, -0.8011F, -1.1118F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1855F, -0.3435F, -0.0631F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 8, 43, -0.25F, 1.1011F, -2.0F, 1, 1, 3, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, -0.8011F, -1.1118F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1855F, 0.3435F, 0.0631F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 43, -0.75F, 1.1011F, -2.0F, 1, 1, 3, -0.01F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(4.5F, 1.5F, -1.0F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.9599F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.frontleftleg.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.387F, -0.8036F, 0.0956F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 41, -0.1533F, -0.7615F, -0.7247F, 4, 2, 2, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(1.4666F, 1.218F, 2.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.829F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.7166F, 1.282F, 0.25F);
        this.frontleftleg2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.3054F, -0.0436F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 42, -0.2609F, -2.0002F, -2.0F, 2, 3, 2, -0.01F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.7166F, 2.282F, -0.5F);
        this.frontleftleg2.addChild(frontleftleg3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.0F, 0.75F);
        this.frontleftleg3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.3054F, -0.0436F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 25, 15, -1.2609F, 0.9998F, -5.0F, 4, 0, 5, -0.01F, false));

        this.frontrightleg4 = new AdvancedModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-3.5F, 1.5F, -1.0F);
        this.upperbody.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, -0.2618F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.frontrightleg4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.387F, 0.8036F, -0.0956F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 24, 41, -3.8467F, -0.7615F, -0.7247F, 4, 2, 2, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRenderer(this);
        this.frontrightleg5.setRotationPoint(-1.4666F, 1.218F, 2.75F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.3491F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.7166F, 1.282F, 0.25F);
        this.frontrightleg5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3054F, 0.0436F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 42, -1.7391F, -2.0002F, -2.0F, 2, 3, 2, -0.01F, true));

        this.frontrightleg6 = new AdvancedModelRenderer(this);
        this.frontrightleg6.setRotationPoint(0.7166F, 1.282F, 0.25F);
        this.frontrightleg5.addChild(frontrightleg6);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightleg6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.3054F, 0.0436F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 25, 15, -2.7391F, 0.9998F, -5.0F, 4, 0, 5, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hypsognathus.render(f5 * 0.2f);
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Hypsognathus.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.head.rotateAngleX = (float) Math.toRadians(-5);
        this.neck.rotateAngleX = (float) Math.toRadians(-5);
        this.upperbody.rotateAngleY = (float) Math.toRadians(7.5);
        this.tail.rotateAngleY = (float) Math.toRadians(-7.5);
        this.tail2.rotateAngleY = (float) Math.toRadians(-12);
        this.tail3.rotateAngleY = (float) Math.toRadians(14.9);
        this.tail4.rotateAngleY = (float) Math.toRadians(16.8);
        this.Hypsognathus.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Hypsognathus.offsetY = 1.20F;

        EntityPrehistoricFloraHypsognathus entityHypsognathus = (EntityPrehistoricFloraHypsognathus) e;

        this.faceTarget(f3, f4, 8, upperbody);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Torso = {this.upperbody, this.lowerbody, this.tail};

        float speed = 0.85F;

        //EntityPrehistoricFloraentityHypsognathus entityHypsognathus = (EntityPrehistoricFloraentityHypsognathus) e;
        if (f3 == 0.0F || !entityHypsognathus.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(backleftleg, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(backleftleg, speed, -0.5F, true, -1, 1F, f2, 0.5F);
        this.walk(backleftleg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(backleftleg2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(backleftleg3, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(backleftleg3, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(backleftleg3, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(backrightleg4, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(backrightleg4, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(backrightleg5, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(backrightleg5, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(backrightleg6, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(backrightleg6, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(backrightleg6, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(frontleftleg, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(frontleftleg, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(frontleftleg2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(frontleftleg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(frontleftleg3, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(frontleftleg3, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(frontrightleg4, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(frontrightleg4, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(frontrightleg5, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(frontrightleg6, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(frontrightleg6, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(frontrightleg6, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHypsognathus e = (EntityPrehistoricFloraHypsognathus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.upperbody, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.upperbody, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
