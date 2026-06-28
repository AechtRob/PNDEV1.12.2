package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraShachemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelShachemys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer carapaceright;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer carapaceright2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer carapaceright3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer carapaceleft;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer carapaceleft2;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer carapaceleft3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;

    private ModelAnimator animator;

    public ModelShachemys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 10, 35, -1.0F, 0.0F, 5.85F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -2.0F, -3.25F, -2.75F, 4, 1, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, 0.6F, -3.95F, 10, 2, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.6F, 3.05F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 25, -3.0F, -2.0F, 0.0F, 6, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.6F, -3.95F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 9, -2.5F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.25F, -2.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.384F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -2.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.45F, 4.15F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 19, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.25F, 1.25F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 0, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -3.25F, 1.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.1963F, 0.8334F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 15, 0.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.0F, -3.25F, -0.75F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.8334F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 25, 0.0F, 0.0F, -2.0F, 5, 1, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, -3.25F, -2.75F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3491F, -0.2182F, 0.8334F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, 0.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.0F, -3.25F, -2.75F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.2182F, -0.8334F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -5.0F, 0.0F, -5.0F, 5, 0, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.025F, -2.45F, 4.05F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4187F, 0.4368F, 0.8105F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 14, 0.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.025F, -2.45F, 4.05F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4187F, -0.4368F, -0.8105F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 14, -5.0F, 0.0F, 0.0F, 5, 0, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, -3.25F, 1.25F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, -0.1963F, -0.8334F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 15, -5.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, -3.25F, -0.75F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.8334F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 25, -5.0F, 0.0F, -2.0F, 5, 1, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.45F, -7.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 23, -1.5F, -1.0F, -0.825F, 3, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7769F, 5.6186F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.1658F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 35, -0.5F, -0.225F, 0.175F, 1, 1, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.5F, 1.525F, -5.0F);
        this.body.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3491F, 1.1781F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 36, 15, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.5672F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 18, 39, -2.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-1.0F, 0.05F, -1.75F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.3491F, -0.3054F, -0.0436F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 26, 39, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.5F, 1.525F, -5.0F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3491F, -1.1781F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 36, 15, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.5672F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 18, 39, 0.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(1.0F, 0.05F, -1.75F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.3491F, 0.3054F, 0.0436F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 26, 39, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, true));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.75F, 1.525F, 4.35F);
        this.body.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.3491F, 2.0508F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 36, 19, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0F, 0.5672F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 34, 39, -2.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.0F, 0.05F, -1.75F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.4363F, -0.829F, 0.0873F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 0, 40, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(2.75F, 1.525F, 4.35F);
        this.body.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.3491F, -2.0508F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 36, 19, -1.0F, -0.5F, -2.0F, 2, 1, 3, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.5672F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 34, 39, 0.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(1.0F, 0.05F, -1.75F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.4363F, 0.829F, -0.0873F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 0, 40, -1.0F, -0.5F, -2.0F, 2, 1, 2, -0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -7.15F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 34, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 8, -1.0F, -1.0F, -1.5F, 2, 2, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.275F, -1.25F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 32, 42, -1.0F, -0.75F, -1.0F, 2, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -0.725F, -0.875F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1265F, 0.2618F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 42, -0.5F, 0.0F, -1.975F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.725F, -0.875F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1265F, -0.2618F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 42, -0.5F, 0.0F, -1.975F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.75F, -1.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 42, -0.5F, 0.0F, -1.975F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.075F, -1.1F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 42, -1.0F, -2.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -0.95F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 42, -0.5F, -0.5F, -1.7F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.1F, -1.7F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2531F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 42, -1.0F, -0.6F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.1F, -1.7F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2531F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 42, 0.0F, -0.6F, 0.0F, 1, 1, 2, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.575F, -0.275F, -1.925F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, -0.2618F, 0.1222F, 0.1309F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.75F, -0.75F);
        this.eyeright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, -0.5672F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 38, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.575F, -0.275F, -1.925F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, -0.2618F, -0.1222F, -0.1309F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.75F, -0.75F);
        this.eyeleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3491F, 0.5672F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 38, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.carapaceright = new AdvancedModelRenderer(this);
        this.carapaceright.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(carapaceright);
        this.setRotateAngle(carapaceright, 0.0F, 0.0F, -0.0873F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, 0.0F, 8.675F);
        this.carapaceright.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 1.3963F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 36, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.3F, 0.0F, 7.775F);
        this.carapaceright.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 1.1083F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 26, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-5.35F, 0.0F, 5.575F);
        this.carapaceright.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.7418F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 4, 0.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-5.75F, 0.0F, 4.65F);
        this.carapaceright.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.3927F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 40, 34, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-6.275F, 0.0F, 0.7F);
        this.carapaceright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.1309F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 30, 0.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-6.1F, 0.0F, -2.3F);
        this.carapaceright.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.0611F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 35, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.carapaceright2 = new AdvancedModelRenderer(this);
        this.carapaceright2.setRotationPoint(-4.25F, 0.0F, -2.325F);
        this.carapaceright.addChild(carapaceright2);
        this.setRotateAngle(carapaceright2, -0.0873F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.carapaceright2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 1.0908F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 30, -4.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.carapaceright3 = new AdvancedModelRenderer(this);
        this.carapaceright3.setRotationPoint(1.4F, -0.15F, -3.4F);
        this.carapaceright2.addChild(carapaceright3);
        this.setRotateAngle(carapaceright3, -0.2967F, 0.0F, -0.0873F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.85F, 0.0F, -2.275F);
        this.carapaceright3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 38, 12, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.carapaceright3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.7854F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 39, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.carapaceleft = new AdvancedModelRenderer(this);
        this.carapaceleft.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body.addChild(carapaceleft);
        this.setRotateAngle(carapaceleft, 0.0F, 0.0F, 0.0873F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.5F, 0.0F, 8.675F);
        this.carapaceleft.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -1.3963F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 40, 36, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.3F, 0.0F, 7.775F);
        this.carapaceleft.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -1.1083F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 26, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(5.35F, 0.0F, 5.575F);
        this.carapaceleft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.7418F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 34, 4, -3.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(5.75F, 0.0F, 4.65F);
        this.carapaceleft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.3927F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 34, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.01F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(6.275F, 0.0F, 0.7F);
        this.carapaceleft.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1309F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 30, -3.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(6.1F, 0.0F, -2.3F);
        this.carapaceleft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0611F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 35, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, true));

        this.carapaceleft2 = new AdvancedModelRenderer(this);
        this.carapaceleft2.setRotationPoint(4.25F, 0.0F, -2.325F);
        this.carapaceleft.addChild(carapaceleft2);
        this.setRotateAngle(carapaceleft2, -0.0873F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.carapaceleft2.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -1.0908F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 30, 30, 0.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, true));

        this.carapaceleft3 = new AdvancedModelRenderer(this);
        this.carapaceleft3.setRotationPoint(-1.4F, -0.15F, -3.4F);
        this.carapaceleft2.addChild(carapaceleft3);
        this.setRotateAngle(carapaceleft3, -0.2967F, 0.0F, 0.0873F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-1.85F, 0.0F, -2.275F);
        this.carapaceleft3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3927F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 38, 12, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.carapaceleft3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.7854F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 39, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.01F, true));
        

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.8F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.4F, 3.8F, -0.2F);
        
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.body.offsetY = -0.105F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraShachemys entityShachemys = (EntityPrehistoricFloraShachemys) e;

        if (entityShachemys.getAnimation() == entityShachemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        if (entityShachemys.getAnimation() == entityShachemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityShachemys.isReallyInWater()) {

                if (f3 == 0.0F || !entityShachemys.getIsMoving()) {
                    if (entityShachemys.getAnimation() != entityShachemys.EAT_ANIMATION
                        && entityShachemys.getAnimation() != entityShachemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityShachemys.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraShachemys ee = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if(ee.getIsFast()) {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else {
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //animIdlePose(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                //Swimming pose:
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 20) / 10) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 30) / 20) * (0-(5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 10) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 20) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 20) / 10) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 30) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -8.5 + (((tickAnim - 20) / 10) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 30) / 20) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 30) / 20) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-48.4036-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.1888-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-34.4454-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.4036 + (((tickAnim - 20) / 10) * (-48.4036-(-48.4036)));
            yy = -2.1888 + (((tickAnim - 20) / 10) * (-2.1888-(-2.1888)));
            zz = -34.4454 + (((tickAnim - 20) / 10) * (-34.4454-(-34.4454)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -48.4036 + (((tickAnim - 30) / 20) * (0-(-48.4036)));
            yy = -2.1888 + (((tickAnim - 30) / 20) * (0-(-2.1888)));
            zz = -34.4454 + (((tickAnim - 30) / 20) * (0-(-34.4454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.4314-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.9949-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (9.6178-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.4314 + (((tickAnim - 20) / 10) * (12.4314-(12.4314)));
            yy = 0.9949 + (((tickAnim - 20) / 10) * (0.9949-(0.9949)));
            zz = 9.6178 + (((tickAnim - 20) / 10) * (9.6178-(9.6178)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.4314 + (((tickAnim - 30) / 20) * (0-(12.4314)));
            yy = 0.9949 + (((tickAnim - 30) / 20) * (0-(0.9949)));
            zz = 9.6178 + (((tickAnim - 30) / 20) * (0-(9.6178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-35-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 14) / 9) * (131.256-(3.75)));
            yy = -35 + (((tickAnim - 14) / 9) * (-71.5933-(-35)));
            zz = 0 + (((tickAnim - 14) / 9) * (118.1519-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 131.256 + (((tickAnim - 23) / 10) * (132.1099-(131.256)));
            yy = -71.5933 + (((tickAnim - 23) / 10) * (-94.1958-(-71.5933)));
            zz = 118.1519 + (((tickAnim - 23) / 10) * (90.9306-(118.1519)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 132.1099 + (((tickAnim - 33) / 9) * (47.555-(132.1099)));
            yy = -94.1958 + (((tickAnim - 33) / 9) * (-47.0979-(-94.1958)));
            zz = 90.9306 + (((tickAnim - 33) / 9) * (45.4653-(90.9306)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 47.555 + (((tickAnim - 42) / 8) * (0-(47.555)));
            yy = -47.0979 + (((tickAnim - 42) / 8) * (0-(-47.0979)));
            zz = 45.4653 + (((tickAnim - 42) / 8) * (0-(45.4653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 14) / 19) * (9.9044-(0)));
            yy = 0 + (((tickAnim - 14) / 19) * (-23.4157-(0)));
            zz = 0 + (((tickAnim - 14) / 19) * (3.9981-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 9.9044 + (((tickAnim - 33) / 4) * (-33.479-(9.9044)));
            yy = -23.4157 + (((tickAnim - 33) / 4) * (-19.4298-(-23.4157)));
            zz = 3.9981 + (((tickAnim - 33) / 4) * (-7.15-(3.9981)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -33.479 + (((tickAnim - 37) / 5) * (0-(-33.479)));
            yy = -19.4298 + (((tickAnim - 37) / 5) * (0-(-19.4298)));
            zz = -7.15 + (((tickAnim - 37) / 5) * (0-(-7.15)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 14) / 10) * (-5.5037-(0)));
            yy = 0 + (((tickAnim - 14) / 10) * (39.4122-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (-1.7632-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -5.5037 + (((tickAnim - 24) / 9) * (37.5-(-5.5037)));
            yy = 39.4122 + (((tickAnim - 24) / 9) * (46.5-(39.4122)));
            zz = -1.7632 + (((tickAnim - 24) / 9) * (0-(-1.7632)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.5 + (((tickAnim - 33) / 4) * (5.665-(37.5)));
            yy = 46.5 + (((tickAnim - 33) / 4) * (40.0054-(46.5)));
            zz = 0 + (((tickAnim - 33) / 4) * (-23.3675-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = 5.665 + (((tickAnim - 37) / 5) * (0-(5.665)));
            yy = 40.0054 + (((tickAnim - 37) / 5) * (0-(40.0054)));
            zz = -23.3675 + (((tickAnim - 37) / 5) * (0-(-23.3675)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -12 + (((tickAnim - 20) / 10) * (-12-(-12)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 30) / 20) * (0-(-12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-48.4036-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.1888-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (34.4454-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -48.4036 + (((tickAnim - 20) / 10) * (-48.4036-(-48.4036)));
            yy = 2.1888 + (((tickAnim - 20) / 10) * (2.1888-(2.1888)));
            zz = 34.4454 + (((tickAnim - 20) / 10) * (34.4454-(34.4454)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -48.4036 + (((tickAnim - 30) / 20) * (0-(-48.4036)));
            yy = 2.1888 + (((tickAnim - 30) / 20) * (0-(2.1888)));
            zz = 34.4454 + (((tickAnim - 30) / 20) * (0-(34.4454)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.4314-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.9949-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-9.6178-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 12.4314 + (((tickAnim - 20) / 10) * (12.4314-(12.4314)));
            yy = -0.9949 + (((tickAnim - 20) / 10) * (-0.9949-(-0.9949)));
            zz = -9.6178 + (((tickAnim - 20) / 10) * (-9.6178-(-9.6178)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.4314 + (((tickAnim - 30) / 20) * (0-(12.4314)));
            yy = -0.9949 + (((tickAnim - 30) / 20) * (0-(-0.9949)));
            zz = -9.6178 + (((tickAnim - 30) / 20) * (0-(-9.6178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (131.256-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (71.5933-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-118.1519-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 131.256 + (((tickAnim - 10) / 10) * (132.1099-(131.256)));
            yy = 71.5933 + (((tickAnim - 10) / 10) * (94.1958-(71.5933)));
            zz = -118.1519 + (((tickAnim - 10) / 10) * (-90.9306-(-118.1519)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 132.1099 + (((tickAnim - 20) / 10) * (30.805-(132.1099)));
            yy = 94.1958 + (((tickAnim - 20) / 10) * (47.0979-(94.1958)));
            zz = -90.9306 + (((tickAnim - 20) / 10) * (-45.4653-(-90.9306)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 30.805 + (((tickAnim - 30) / 10) * (131.256-(30.805)));
            yy = 47.0979 + (((tickAnim - 30) / 10) * (71.5933-(47.0979)));
            zz = -45.4653 + (((tickAnim - 30) / 10) * (-118.1519-(-45.4653)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 131.256 + (((tickAnim - 40) / 10) * (0-(131.256)));
            yy = 71.5933 + (((tickAnim - 40) / 10) * (0-(71.5933)));
            zz = -118.1519 + (((tickAnim - 40) / 10) * (0-(-118.1519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.9044-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (23.4157-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.9981-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.9044 + (((tickAnim - 20) / 10) * (0-(9.9044)));
            yy = 23.4157 + (((tickAnim - 20) / 10) * (0-(23.4157)));
            zz = -3.9981 + (((tickAnim - 20) / 10) * (0-(-3.9981)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.5037-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-39.4122-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.7632-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.5037 + (((tickAnim - 10) / 10) * (37.5-(-5.5037)));
            yy = -39.4122 + (((tickAnim - 10) / 10) * (-46.5-(-39.4122)));
            zz = 1.7632 + (((tickAnim - 10) / 10) * (0-(1.7632)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.5 + (((tickAnim - 20) / 10) * (0-(37.5)));
            yy = -46.5 + (((tickAnim - 20) / 10) * (0-(-46.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (39.9963-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-39.4122-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (1.7632-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 39.9963 + (((tickAnim - 40) / 10) * (0-(39.9963)));
            yy = -39.4122 + (((tickAnim - 40) / 10) * (0-(-39.4122)));
            zz = 1.7632 + (((tickAnim - 40) / 10) * (0-(1.7632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.9303-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.0062-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-7.9367-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.9303 + (((tickAnim - 5) / 5) * (4.1739-(-4.9303)));
            yy = -1.0062 + (((tickAnim - 5) / 5) * (10.1692-(-1.0062)));
            zz = -7.9367 + (((tickAnim - 5) / 5) * (-6.6372-(-7.9367)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.1739 + (((tickAnim - 10) / 3) * (5.1109-(4.1739)));
            yy = 10.1692 + (((tickAnim - 10) / 3) * (30.2659-(10.1692)));
            zz = -6.6372 + (((tickAnim - 10) / 3) * (-3.9676-(-6.6372)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5.1109 + (((tickAnim - 13) / 7) * (0-(5.1109)));
            yy = 30.2659 + (((tickAnim - 13) / 7) * (0-(30.2659)));
            zz = -3.9676 + (((tickAnim - 13) / 7) * (0-(-3.9676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 5) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 5) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -4.5 + (((tickAnim - 10) / 3) * (-25.25-(-4.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -25.25 + (((tickAnim - 13) / 7) * (0-(-25.25)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 10) / 3) * (0-(0.025)));
            zz = -0.325 + (((tickAnim - 10) / 3) * (0-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29 + (((tickAnim - 5) / 5) * (1.4866-(29)));
            yy = 0 + (((tickAnim - 5) / 5) * (-22.0571-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-13.5274-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.4866 + (((tickAnim - 10) / 3) * (0-(1.4866)));
            yy = -22.0571 + (((tickAnim - 10) / 3) * (-21.75-(-22.0571)));
            zz = -13.5274 + (((tickAnim - 10) / 3) * (0-(-13.5274)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -21.75 + (((tickAnim - 13) / 7) * (0-(-21.75)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
            zz = 0.225 + (((tickAnim - 5) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0.2 + (((tickAnim - 13) / 7) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14 + (((tickAnim - 13) / 7) * (0-(14)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeright, eyeright.rotateAngleX + (float) Math.toRadians(xx), eyeright.rotateAngleY + (float) Math.toRadians(yy), eyeright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 3) * (0.075-(1)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 13) / 7) * (1-(1)));
            yy = 0.075 + (((tickAnim - 13) / 7) * (1-(0.075)));
            zz = 1 + (((tickAnim - 13) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (62.5-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 62.5 + (((tickAnim - 10) / 3) * (0-(62.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14 + (((tickAnim - 13) / 7) * (0-(14)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeleft, eyeleft.rotateAngleX + (float) Math.toRadians(xx), eyeleft.rotateAngleY + (float) Math.toRadians(yy), eyeleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 13) / 7) * (0-(0.225)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 10) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 3) * (0.075-(1)));
            zz = 1 + (((tickAnim - 10) / 3) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 13) / 7) * (1-(1)));
            yy = 0.075 + (((tickAnim - 13) / 7) * (1-(0.075)));
            zz = 1 + (((tickAnim - 13) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);
        

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 301;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 5) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 7) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = -0.7 + (((tickAnim - 10) / 275) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = -0.7 + (((tickAnim - 285) / 17) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.9-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 3.9 + (((tickAnim - 10) / 275) * (3.9-(3.9)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = 3.9 + (((tickAnim - 285) / 17) * (0-(3.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-29.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = -29.25 + (((tickAnim - 10) / 275) * (-29.25-(-29.25)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = -29.25 + (((tickAnim - 285) / 17) * (0-(-29.25)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.55-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.775-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 2.55 + (((tickAnim - 10) / 275) * (2.55-(2.55)));
            yy = 0.775 + (((tickAnim - 10) / 275) * (0.775-(0.775)));
            zz = 2.775 + (((tickAnim - 10) / 275) * (2.775-(2.775)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 2.55 + (((tickAnim - 285) / 17) * (0-(2.55)));
            yy = 0.775 + (((tickAnim - 285) / 17) * (0-(0.775)));
            zz = 2.775 + (((tickAnim - 285) / 17) * (0-(2.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.9823-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (26.1941-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (61.4792-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 26.9823 + (((tickAnim - 10) / 275) * (26.9823-(26.9823)));
            yy = 26.1941 + (((tickAnim - 10) / 275) * (26.1941-(26.1941)));
            zz = 61.4792 + (((tickAnim - 10) / 275) * (61.4792-(61.4792)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 26.9823 + (((tickAnim - 285) / 17) * (0-(26.9823)));
            yy = 26.1941 + (((tickAnim - 285) / 17) * (0-(26.1941)));
            zz = 61.4792 + (((tickAnim - 285) / 17) * (0-(61.4792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (72.9288-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-105.8051-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (67.6252-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 72.9288 + (((tickAnim - 10) / 275) * (72.9288-(72.9288)));
            yy = -105.8051 + (((tickAnim - 10) / 275) * (-105.8051-(-105.8051)));
            zz = 67.6252 + (((tickAnim - 10) / 275) * (67.6252-(67.6252)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 72.9288 + (((tickAnim - 285) / 17) * (0-(72.9288)));
            yy = -105.8051 + (((tickAnim - 285) / 17) * (0-(-105.8051)));
            zz = 67.6252 + (((tickAnim - 285) / 17) * (0-(67.6252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 1.95 + (((tickAnim - 10) / 275) * (1.95-(1.95)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 1.95 + (((tickAnim - 285) / 17) * (0-(1.95)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-36.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = -36.25 + (((tickAnim - 10) / 275) * (-36.25-(-36.25)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = -36.25 + (((tickAnim - 285) / 17) * (0-(-36.25)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.95-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 1.3 + (((tickAnim - 10) / 275) * (1.3-(1.3)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = -0.95 + (((tickAnim - 10) / 275) * (-0.95-(-0.95)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 1.3 + (((tickAnim - 285) / 17) * (0-(1.3)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = -0.95 + (((tickAnim - 285) / 17) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (23.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            yy = 23.75 + (((tickAnim - 10) / 275) * (23.75-(23.75)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            yy = 23.75 + (((tickAnim - 285) / 17) * (0-(23.75)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.475-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = -2.25 + (((tickAnim - 10) / 275) * (-2.25-(-2.25)));
            yy = 0.55 + (((tickAnim - 10) / 275) * (0.55-(0.55)));
            zz = 2.475 + (((tickAnim - 10) / 275) * (2.475-(2.475)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = -2.25 + (((tickAnim - 285) / 17) * (0-(-2.25)));
            yy = 0.55 + (((tickAnim - 285) / 17) * (0-(0.55)));
            zz = 2.475 + (((tickAnim - 285) / 17) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = -0.225 + (((tickAnim - 10) / 275) * (-0.225-(-0.225)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 0.35 + (((tickAnim - 10) / 275) * (0.35-(0.35)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = -0.225 + (((tickAnim - 285) / 17) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = 0.35 + (((tickAnim - 285) / 17) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.9823-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-26.1941-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-61.4792-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 26.9823 + (((tickAnim - 10) / 275) * (26.9823-(26.9823)));
            yy = -26.1941 + (((tickAnim - 10) / 275) * (-26.1941-(-26.1941)));
            zz = -61.4792 + (((tickAnim - 10) / 275) * (-61.4792-(-61.4792)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 26.9823 + (((tickAnim - 285) / 17) * (0-(26.9823)));
            yy = -26.1941 + (((tickAnim - 285) / 17) * (0-(-26.1941)));
            zz = -61.4792 + (((tickAnim - 285) / 17) * (0-(-61.4792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (72.9288-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (105.8051-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-67.6252-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = 72.9288 + (((tickAnim - 10) / 275) * (72.9288-(72.9288)));
            yy = 105.8051 + (((tickAnim - 10) / 275) * (105.8051-(105.8051)));
            zz = -67.6252 + (((tickAnim - 10) / 275) * (-67.6252-(-67.6252)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = 72.9288 + (((tickAnim - 285) / 17) * (0-(72.9288)));
            yy = 105.8051 + (((tickAnim - 285) / 17) * (0-(105.8051)));
            zz = -67.6252 + (((tickAnim - 285) / 17) * (0-(-67.6252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.95-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 285) {
            xx = -1.95 + (((tickAnim - 10) / 275) * (-1.95-(-1.95)));
            yy = 0 + (((tickAnim - 10) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 275) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 302) {
            xx = -1.95 + (((tickAnim - 285) / 17) * (0-(-1.95)));
            yy = 0 + (((tickAnim - 285) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);
        
    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 480;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = -2.5 + (((tickAnim - 40) / 410) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 410) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 410) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -2.5 + (((tickAnim - 450) / 30) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 40) / 410) * (0-(0)));
            yy = -0.35 + (((tickAnim - 40) / 410) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 40) / 410) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            yy = -0.35 + (((tickAnim - 450) / 30) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 450) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 0) / 40) * (-17.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = -17.75 + (((tickAnim - 40) / 99) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 99) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 147) {
            xx = -17.75 + (((tickAnim - 139) / 8) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 139) / 8) * (-1.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 139) / 8) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 180) {
            xx = -17.75 + (((tickAnim - 147) / 33) * (-20.4248-(-17.75)));
            yy = -1.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 147) / 33) * (-11.2295-(-1.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = 0 + (((tickAnim - 147) / 33) * (-2.4693-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = -20.4248 + (((tickAnim - 180) / 100) * (-20.4248-(-20.4248)));
            yy = -11.2295 + (((tickAnim - 180) / 100) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 180) / 100) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -20.4248 + (((tickAnim - 280) / 40) * (-23.9248-(-20.4248)));
            yy = -11.2295 + (((tickAnim - 280) / 40) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 280) / 40) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -23.9248 + (((tickAnim - 320) / 20) * (-25.4248-(-23.9248)));
            yy = -11.2295 + (((tickAnim - 320) / 20) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 320) / 20) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 340 && tickAnim < 349) {
            xx = -25.4248 + (((tickAnim - 340) / 9) * (-18.9248-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(-25.4248)));
            yy = -11.2295 + (((tickAnim - 340) / 9) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 340) / 9) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 349 && tickAnim < 360) {
            xx = -18.9248-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 349) / 11) * (-18.6748-(-18.9248-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = -11.2295 + (((tickAnim - 349) / 11) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 349) / 11) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 360 && tickAnim < 450) {
            xx = -18.6748 + (((tickAnim - 360) / 90) * (-18.6748-(-18.6748)));
            yy = -11.2295 + (((tickAnim - 360) / 90) * (-11.2295-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 360) / 90) * (-2.4693-(-2.4693)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -18.6748 + (((tickAnim - 450) / 30) * (0-(-18.6748)));
            yy = -11.2295 + (((tickAnim - 450) / 30) * (0-(-11.2295)));
            zz = -2.4693 + (((tickAnim - 450) / 30) * (0-(-2.4693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.55-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            zz = -0.55 + (((tickAnim - 40) / 99) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 139 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 139) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 139) / 8) * (0-(0)));
            zz = -0.55 + (((tickAnim - 139) / 8) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 147 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 147) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 33) * (-0.1-(0)));
            zz = -0.55 + (((tickAnim - 147) / 33) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = -0.1 + (((tickAnim - 180) / 100) * (-0.1-(-0.1)));
            zz = -0.55 + (((tickAnim - 180) / 100) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 280 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 280) / 170) * (0-(0)));
            yy = -0.1 + (((tickAnim - 280) / 170) * (-0.1-(-0.1)));
            zz = -0.55 + (((tickAnim - 280) / 170) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            yy = -0.1 + (((tickAnim - 450) / 30) * (0-(-0.1)));
            zz = -0.55 + (((tickAnim - 450) / 30) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = -20 + (((tickAnim - 40) / 99) * (-20-(-20)));
            yy = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 99) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 147) {
            xx = -20 + (((tickAnim - 139) / 8) * (-20-(-20)));
            yy = 0 + (((tickAnim - 139) / 8) * (-2.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(0)));
            zz = 0 + (((tickAnim - 139) / 8) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 180) {
            xx = -20 + (((tickAnim - 147) / 33) * (-19.8002-(-20)));
            yy = -2.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 147) / 33) * (-8.4034-(-2.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            zz = 0 + (((tickAnim - 147) / 33) * (-1.2799-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = -19.8002 + (((tickAnim - 180) / 100) * (-19.8002-(-19.8002)));
            yy = -8.4034 + (((tickAnim - 180) / 100) * (-8.4034-(-8.4034)));
            zz = -1.2799 + (((tickAnim - 180) / 100) * (-1.2799-(-1.2799)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -19.8002 + (((tickAnim - 280) / 40) * (-10.3595-(-19.8002)));
            yy = -8.4034 + (((tickAnim - 280) / 40) * (-7.8132-(-8.4034)));
            zz = -1.2799 + (((tickAnim - 280) / 40) * (0.9132-(-1.2799)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -10.3595 + (((tickAnim - 320) / 20) * (-7.8595-(-10.3595)));
            yy = -7.8132 + (((tickAnim - 320) / 20) * (-7.8132-(-7.8132)));
            zz = 0.9132 + (((tickAnim - 320) / 20) * (0.9132-(0.9132)));
        }
        else if (tickAnim >= 340 && tickAnim < 349) {
            xx = -7.8595 + (((tickAnim - 340) / 9) * (-13.8595-(-7.8595)));
            yy = -7.8132 + (((tickAnim - 340) / 9) * (-7.8132-(-7.8132)));
            zz = 0.9132 + (((tickAnim - 340) / 9) * (0.9132-(0.9132)));
        }
        else if (tickAnim >= 349 && tickAnim < 360) {
            xx = -13.8595 + (((tickAnim - 349) / 11) * (-18.1095-(-13.8595)));
            yy = -7.8132 + (((tickAnim - 349) / 11) * (-7.8132-(-7.8132)));
            zz = 0.9132 + (((tickAnim - 349) / 11) * (0.9132-(0.9132)));
        }
        else if (tickAnim >= 360 && tickAnim < 450) {
            xx = -18.1095 + (((tickAnim - 360) / 90) * (-18.1095-(-18.1095)));
            yy = -7.8132 + (((tickAnim - 360) / 90) * (-7.8132-(-7.8132)));
            zz = 0.9132 + (((tickAnim - 360) / 90) * (0.9132-(0.9132)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -18.1095 + (((tickAnim - 450) / 30) * (0-(-18.1095)));
            yy = -7.8132 + (((tickAnim - 450) / 30) * (0-(-7.8132)));
            zz = 0.9132 + (((tickAnim - 450) / 30) * (0-(0.9132)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            yy = 0.075 + (((tickAnim - 40) / 99) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 40) / 99) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 139) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 139) / 8) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 139) / 8) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 147) / 133) * (0-(0)));
            yy = 0.075 + (((tickAnim - 147) / 133) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 147) / 133) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 280) / 170) * (0-(0)));
            yy = 0.075 + (((tickAnim - 280) / 170) * (0.075-(0.075)));
            zz = 0 + (((tickAnim - 280) / 170) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            yy = 0.075 + (((tickAnim - 450) / 30) * (0-(0.075)));
            zz = 0 + (((tickAnim - 450) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = 27.75 + (((tickAnim - 40) / 99) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 99) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 140) {
            xx = 27.75 + (((tickAnim - 139) / 1) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 139) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 1) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 27.75 + (((tickAnim - 140) / 40) * (27.8634-(27.75)));
            yy = 0 + (((tickAnim - 140) / 40) * (-4.2855-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (-3.0356-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 27.8634 + (((tickAnim - 180) / 100) * (27.8634-(27.8634)));
            yy = -4.2855 + (((tickAnim - 180) / 100) * (-4.2855-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 180) / 100) * (-3.0356-(-3.0356)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 27.8634 + (((tickAnim - 280) / 40) * (17.6134-(27.8634)));
            yy = -4.2855 + (((tickAnim - 280) / 40) * (-4.2855-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 280) / 40) * (-3.0356-(-3.0356)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 17.6134 + (((tickAnim - 320) / 20) * (12.1134-(17.6134)));
            yy = -4.2855 + (((tickAnim - 320) / 20) * (-4.2855-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 320) / 20) * (-3.0356-(-3.0356)));
        }
        else if (tickAnim >= 340 && tickAnim < 349) {
            xx = 12.1134 + (((tickAnim - 340) / 9) * (30.1134-(12.1134)));
            yy = -4.2855 + (((tickAnim - 340) / 9) * (-4.2855-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 340) / 9) * (-3.0356-(-3.0356)));
        }
        else if (tickAnim >= 349 && tickAnim < 450) {
            xx = 30.1134 + (((tickAnim - 349) / 101) * (30.1134-(30.1134)));
            yy = -4.2855 + (((tickAnim - 349) / 101) * (-4.2855-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 349) / 101) * (-3.0356-(-3.0356)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 30.1134 + (((tickAnim - 450) / 30) * (0-(30.1134)));
            yy = -4.2855 + (((tickAnim - 450) / 30) * (0-(-4.2855)));
            zz = -3.0356 + (((tickAnim - 450) / 30) * (0-(-3.0356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 40) / 99) * (0-(0)));
            yy = 0.1 + (((tickAnim - 40) / 99) * (0.1-(0.1)));
            zz = 0.175 + (((tickAnim - 40) / 99) * (0.175-(0.175)));
        }
        else if (tickAnim >= 139 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 139) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 139) / 1) * (0.1-(0.1)));
            zz = 0.175 + (((tickAnim - 139) / 1) * (0.175-(0.175)));
        }
        else if (tickAnim >= 140 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 140) / 340) * (0-(0)));
            yy = 0.1 + (((tickAnim - 140) / 340) * (0-(0.1)));
            zz = 0.175 + (((tickAnim - 140) / 340) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (17.75-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 17.75 + (((tickAnim - 40) / 2) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 17.75 + (((tickAnim - 42) / 11) * (0-(17.75)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 127) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 180) / 8) * (17.75-(0)));
            yy = 0 + (((tickAnim - 180) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 8) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 17.75 + (((tickAnim - 188) / 2) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 188) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 2) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 17.75 + (((tickAnim - 190) / 11) * (0-(17.75)));
            yy = 0 + (((tickAnim - 190) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 11) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 279) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeright, eyeright.rotateAngleX + (float) Math.toRadians(xx), eyeright.rotateAngleY + (float) Math.toRadians(yy), eyeright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 2) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 42) / 11) * (0-(0.275)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 127) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 180) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 180) / 8) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 188) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 188) / 2) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 188) / 2) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 190) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 190) / 11) * (0-(0.275)));
            zz = 0 + (((tickAnim - 190) / 11) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 279) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 0) / 32) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 32) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 32) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 32) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 32) / 8) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 32) / 8) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 40) / 2) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 40) / 2) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 40) / 2) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 42) / 11) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 42) / 11) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 42) / 11) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 53) / 127) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 127) * (1-(1)));
            zz = 1 + (((tickAnim - 53) / 127) * (1-(1)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 1 + (((tickAnim - 180) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 180) / 8) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 180) / 8) * (1-(1)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 1 + (((tickAnim - 188) / 2) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 188) / 2) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 188) / 2) * (1-(1)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 1 + (((tickAnim - 190) / 11) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 190) / 11) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 190) / 11) * (1-(1)));
        }
        else if (tickAnim >= 201 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 201) / 279) * (1-(1)));
            yy = 1 + (((tickAnim - 201) / 279) * (1-(1)));
            zz = 1 + (((tickAnim - 201) / 279) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 280) / 40) * (40.25-(0)));
            yy = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 40) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = 40.25 + (((tickAnim - 320) / 20) * (48.25-(40.25)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 349) {
            xx = 48.25 + (((tickAnim - 340) / 9) * (0-(48.25)));
            yy = 0 + (((tickAnim - 340) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 9) * (0-(0)));
        }
        else if (tickAnim >= 349 && tickAnim < 450) {
            xx = 0 + (((tickAnim - 349) / 101) * (0-(0)));
            yy = 0 + (((tickAnim - 349) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 349) / 101) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.9124-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-16.7915-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.6822-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = -22.9124 + (((tickAnim - 40) / 410) * (-22.9124-(-22.9124)));
            yy = -16.7915 + (((tickAnim - 40) / 410) * (-16.7915-(-16.7915)));
            zz = -1.6822 + (((tickAnim - 40) / 410) * (-1.6822-(-1.6822)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -22.9124 + (((tickAnim - 450) / 30) * (0-(-22.9124)));
            yy = -16.7915 + (((tickAnim - 450) / 30) * (0-(-16.7915)));
            zz = -1.6822 + (((tickAnim - 450) / 30) * (0-(-1.6822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29.2054-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (35.5973-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-7.2181-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = 29.2054 + (((tickAnim - 40) / 410) * (29.2054-(29.2054)));
            yy = 35.5973 + (((tickAnim - 40) / 410) * (35.5973-(35.5973)));
            zz = -7.2181 + (((tickAnim - 40) / 410) * (-7.2181-(-7.2181)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 29.2054 + (((tickAnim - 450) / 30) * (0-(29.2054)));
            yy = 35.5973 + (((tickAnim - 450) / 30) * (0-(35.5973)));
            zz = -7.2181 + (((tickAnim - 450) / 30) * (0-(-7.2181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = -1.25 + (((tickAnim - 40) / 410) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 40) / 410) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 410) * (0-(0)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -1.25 + (((tickAnim - 450) / 30) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 450) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 450) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (17.75-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 17.75 + (((tickAnim - 40) / 2) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 17.75 + (((tickAnim - 42) / 11) * (0-(17.75)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 127) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 180) / 8) * (17.75-(0)));
            yy = 0 + (((tickAnim - 180) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 8) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 17.75 + (((tickAnim - 188) / 2) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 188) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 2) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 17.75 + (((tickAnim - 190) / 11) * (0-(17.75)));
            yy = 0 + (((tickAnim - 190) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 11) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 279) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeleft, eyeleft.rotateAngleX + (float) Math.toRadians(xx), eyeleft.rotateAngleY + (float) Math.toRadians(yy), eyeleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 2) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 42) / 11) * (0-(0.275)));
            zz = 0 + (((tickAnim - 42) / 11) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 127) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 127) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 180) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 8) * (0.275-(0)));
            zz = 0 + (((tickAnim - 180) / 8) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 188) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 188) / 2) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 188) / 2) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 0 + (((tickAnim - 190) / 11) * (0-(0)));
            yy = 0.275 + (((tickAnim - 190) / 11) * (0-(0.275)));
            zz = 0 + (((tickAnim - 190) / 11) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            yy = 0 + (((tickAnim - 201) / 279) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 279) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 32 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 32) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 32) / 8) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 32) / 8) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 1 + (((tickAnim - 40) / 2) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 40) / 2) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 40) / 2) * (1-(1)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 42) / 11) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 42) / 11) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 42) / 11) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 53) / 127) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 127) * (1-(1)));
            zz = 1 + (((tickAnim - 53) / 127) * (1-(1)));
        }
        else if (tickAnim >= 180 && tickAnim < 188) {
            xx = 1 + (((tickAnim - 180) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 180) / 8) * (0.0275-(1)));
            zz = 1 + (((tickAnim - 180) / 8) * (1-(1)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 1 + (((tickAnim - 188) / 2) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 188) / 2) * (0.0275-(0.0275)));
            zz = 1 + (((tickAnim - 188) / 2) * (1-(1)));
        }
        else if (tickAnim >= 190 && tickAnim < 201) {
            xx = 1 + (((tickAnim - 190) / 11) * (1-(1)));
            yy = 0.0275 + (((tickAnim - 190) / 11) * (1-(0.0275)));
            zz = 1 + (((tickAnim - 190) / 11) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.9124-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (16.7915-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.6822-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = -22.9124 + (((tickAnim - 40) / 410) * (-22.9124-(-22.9124)));
            yy = 16.7915 + (((tickAnim - 40) / 410) * (16.7915-(16.7915)));
            zz = 1.6822 + (((tickAnim - 40) / 410) * (1.6822-(1.6822)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = -22.9124 + (((tickAnim - 450) / 30) * (0-(-22.9124)));
            yy = 16.7915 + (((tickAnim - 450) / 30) * (0-(16.7915)));
            zz = 1.6822 + (((tickAnim - 450) / 30) * (0-(1.6822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (29.2054-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-35.5973-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (7.2181-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 450) {
            xx = 29.2054 + (((tickAnim - 40) / 410) * (29.2054-(29.2054)));
            yy = -35.5973 + (((tickAnim - 40) / 410) * (-35.5973-(-35.5973)));
            zz = 7.2181 + (((tickAnim - 40) / 410) * (7.2181-(7.2181)));
        }
        else if (tickAnim >= 450 && tickAnim < 480) {
            xx = 29.2054 + (((tickAnim - 450) / 30) * (0-(29.2054)));
            yy = -35.5973 + (((tickAnim - 450) / 30) * (0-(-35.5973)));
            zz = 7.2181 + (((tickAnim - 450) / 30) * (0-(7.2181)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), body.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-20), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(28.5066+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-50), frontrightleg.rotateAngleY + (float) Math.toRadians(-65.5297), frontrightleg.rotateAngleZ + (float) Math.toRadians(74.4285));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(33.6373+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-30), frontrightleg2.rotateAngleY + (float) Math.toRadians(-30.7649), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-2.5918));

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 10) * (0-(0.275)));
            zz = 0.325 + (((tickAnim - 0) / 10) * (0-(0.325)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(36.6831+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*-50), frontrightleg3.rotateAngleY + (float) Math.toRadians(22.4708), frontrightleg3.rotateAngleZ + (float) Math.toRadians(-8.072-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-30));
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(0);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(0.125);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*20), backrightleg.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*30), backrightleg.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*20));


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*30), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(26.5155+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), backrightleg3.rotateAngleY + (float) Math.toRadians(27.8942), backrightleg3.rotateAngleZ + (float) Math.toRadians(-4.9512+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*20));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*10), tail.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10));


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(30.465+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*50), frontleftleg.rotateAngleY + (float) Math.toRadians(65.422), frontleftleg.rotateAngleZ + (float) Math.toRadians(-74.3894));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(25.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*30), frontleftleg2.rotateAngleY + (float) Math.toRadians(30.25), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(44.7336+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), frontleftleg3.rotateAngleY + (float) Math.toRadians(-11.3898), frontleftleg3.rotateAngleZ + (float) Math.toRadians(-18.4515-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10));
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(0);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(0);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*20), backleftleg.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*30), backleftleg.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*20));


        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(0), backleftleg2.rotateAngleY + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*30), backleftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(12.201-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*30), backleftleg3.rotateAngleY + (float) Math.toRadians(-40.7031), backleftleg3.rotateAngleZ + (float) Math.toRadians(4.5125+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*20));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 0) / 5) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 0) / 5) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 5) / 13) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 5) / 13) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 5) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 18) / 5) * (-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 18) / 5) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 18) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 23) / 5) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 23) / 5) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 23) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 28) / 10) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 28) / 10) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 28) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5 + (((tickAnim - 38) / 2) * (-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-60))*1.5)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1 + (((tickAnim - 38) / 2) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 38) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05 + (((tickAnim - 0) / 3) * (1.2-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            yy = 1.2 + (((tickAnim - 3) / 11) * (1.2-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 3) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 14) / 4) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 14) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05 + (((tickAnim - 18) / 5) * (1.2-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 18) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 1.2 + (((tickAnim - 23) / 14) * (1.2-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 23) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 1.2 + (((tickAnim - 37) / 3) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.05-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15 + (((tickAnim - 37) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-20))*-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-20))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-80))*-2), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7.25), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 22.03 + (((tickAnim - 0) / 18) * (90.0923-(22.03)));
            yy = -23.096 + (((tickAnim - 0) / 18) * (-9.5574-(-23.096)));
            zz = 15.2631 + (((tickAnim - 0) / 18) * (71.0447-(15.2631)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 90.0923 + (((tickAnim - 18) / 10) * (-57.8169-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*150-(90.0923)));
            yy = -9.5574 + (((tickAnim - 18) / 10) * (-42.7923-(-9.5574)));
            zz = 71.0447 + (((tickAnim - 18) / 10) * (95.4736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80-(71.0447)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -57.8169-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*150 + (((tickAnim - 28) / 9) * (14.6814-(-57.8169-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*150)));
            yy = -42.7923 + (((tickAnim - 28) / 9) * (-27.9451-(-42.7923)));
            zz = 95.4736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80 + (((tickAnim - 28) / 9) * (12.8364-(95.4736+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 14.6814 + (((tickAnim - 37) / 3) * (22.03-(14.6814)));
            yy = -27.9451 + (((tickAnim - 37) / 3) * (-23.096-(-27.9451)));
            zz = 12.8364 + (((tickAnim - 37) / 3) * (15.2631-(12.8364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 17.2981 + (((tickAnim - 0) / 18) * (4.8062-(17.2981)));
            yy = -29.1419 + (((tickAnim - 0) / 18) * (-18.7646-(-29.1419)));
            zz = 0.7209 + (((tickAnim - 0) / 18) * (6.6042-(0.7209)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 4.8062 + (((tickAnim - 18) / 10) * (0-(4.8062)));
            yy = -18.7646 + (((tickAnim - 18) / 10) * (-16.75-(-18.7646)));
            zz = 6.6042 + (((tickAnim - 18) / 10) * (0-(6.6042)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (22.4339-(0)));
            yy = -16.75 + (((tickAnim - 28) / 9) * (-31.106-(-16.75)));
            zz = 0 + (((tickAnim - 28) / 9) * (-1.0994-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 22.4339 + (((tickAnim - 37) / 3) * (17.2981-(22.4339)));
            yy = -31.106 + (((tickAnim - 37) / 3) * (-29.1419-(-31.106)));
            zz = -1.0994 + (((tickAnim - 37) / 3) * (0.7209-(-1.0994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 18) * (0-(0.075)));
            zz = 0.15 + (((tickAnim - 0) / 18) * (0-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0.075-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0.15-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0.075 + (((tickAnim - 37) / 3) * (0.075-(0.075)));
            zz = 0.15 + (((tickAnim - 37) / 3) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -44.5683 + (((tickAnim - 0) / 8) * (-65.883-(-44.5683)));
            yy = -21.9804 + (((tickAnim - 0) / 8) * (-33.7525-(-21.9804)));
            zz = 34.2298 + (((tickAnim - 0) / 8) * (45.0307-(34.2298)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -65.883 + (((tickAnim - 8) / 10) * (-71.5291-(-65.883)));
            yy = -33.7525 + (((tickAnim - 8) / 10) * (-35.2583-(-33.7525)));
            zz = 45.0307 + (((tickAnim - 8) / 10) * (59.2859-(45.0307)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -71.5291 + (((tickAnim - 18) / 5) * (-302.4599-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-71.5291)));
            yy = -35.2583 + (((tickAnim - 18) / 5) * (-219.0371-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-35.2583)));
            zz = 59.2859 + (((tickAnim - 18) / 5) * (138.3767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(59.2859)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -302.4599-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 23) / 5) * (-114.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-302.4599-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -219.0371-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 23) / 5) * (0.9661-(-219.0371-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 138.3767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 23) / 5) * (-6.2673-(138.3767+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -114.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 28) / 9) * (-36.5433-(-114.3401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0.9661 + (((tickAnim - 28) / 9) * (-15.4054-(0.9661)));
            zz = -6.2673 + (((tickAnim - 28) / 9) * (29.1298-(-6.2673)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -36.5433 + (((tickAnim - 37) / 3) * (-46.2222-(-36.5433)));
            yy = -15.4054 + (((tickAnim - 37) / 3) * (-17.206-(-15.4054)));
            zz = 29.1298 + (((tickAnim - 37) / 3) * (36.9695-(29.1298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -0.175 + (((tickAnim - 0) / 18) * (0.1-(-0.175)));
            yy = -0.275 + (((tickAnim - 0) / 18) * (-0.45-(-0.275)));
            zz = 0.3 + (((tickAnim - 0) / 18) * (-0.025-(0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.1 + (((tickAnim - 18) / 5) * (0-(0.1)));
            yy = -0.45 + (((tickAnim - 18) / 5) * (0-(-0.45)));
            zz = -0.025 + (((tickAnim - 18) / 5) * (0-(-0.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0.3-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.175 + (((tickAnim - 37) / 3) * (-0.175-(-0.175)));
            yy = -0.275 + (((tickAnim - 37) / 3) * (-0.275-(-0.275)));
            zz = 0.3 + (((tickAnim - 37) / 3) * (0.3-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 29 + (((tickAnim - 0) / 11) * (-20.25-(29)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 11) / 11) * (23.75-(5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -20.25 + (((tickAnim - 11) / 11) * (-39-(-20.25)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 23.75 + (((tickAnim - 22) / 18) * (0-(23.75)));
            yy = -39 + (((tickAnim - 22) / 18) * (29-(-39)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 43.6017 + (((tickAnim - 0) / 11) * (53.3829-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(43.6017)));
            yy = -28.6882 + (((tickAnim - 0) / 11) * (0.7394-(-28.6882)));
            zz = 3.6478 + (((tickAnim - 0) / 11) * (0.8141-(3.6478)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 53.3829-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 11) / 11) * (0-(53.3829-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0.7394 + (((tickAnim - 11) / 11) * (-27.25-(0.7394)));
            zz = 0.8141 + (((tickAnim - 11) / 11) * (0-(0.8141)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (43.6017-(0)));
            yy = -27.25 + (((tickAnim - 22) / 18) * (-28.6882-(-27.25)));
            zz = 0 + (((tickAnim - 22) / 18) * (3.6478-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 22) * (0-(0.125)));
            zz = 0.3 + (((tickAnim - 0) / 22) * (0-(0.3)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0.125-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -53.9279 + (((tickAnim - 0) / 7) * (-12.25-(-53.9279)));
            yy = 24.2236 + (((tickAnim - 0) / 7) * (27.975-(24.2236)));
            zz = 52.1837 + (((tickAnim - 0) / 7) * (0-(52.1837)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = -12.25 + (((tickAnim - 7) / 15) * (-49.9324-(-12.25)));
            yy = 27.975 + (((tickAnim - 7) / 15) * (0.2158-(27.975)));
            zz = 0 + (((tickAnim - 7) / 15) * (62.2675-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -49.9324 + (((tickAnim - 22) / 18) * (-53.9279-(-49.9324)));
            yy = 0.2158 + (((tickAnim - 22) / 18) * (24.2236-(0.2158)));
            zz = 62.2675 + (((tickAnim - 22) / 18) * (52.1837-(62.2675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.45 + (((tickAnim - 0) / 7) * (0-(-0.45)));
            yy = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
            zz = -0.3 + (((tickAnim - 0) / 7) * (0-(-0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 7) / 15) * (-0.45-(0)));
            yy = 0 + (((tickAnim - 7) / 15) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 7) / 15) * (-0.025-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -0.45 + (((tickAnim - 22) / 18) * (-0.45-(-0.45)));
            yy = -0.2 + (((tickAnim - 22) / 18) * (-0.25-(-0.2)));
            zz = -0.025 + (((tickAnim - 22) / 18) * (-0.3-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*1.5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 90.0923 + (((tickAnim - 0) / 9) * (-38.6419-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(90.0923)));
            yy = 9.5574 + (((tickAnim - 0) / 9) * (42.7923-(9.5574)));
            zz = -71.0447 + (((tickAnim - 0) / 9) * (-118.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80-(-71.0447)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -38.6419-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 9) / 9) * (14.6814-(-38.6419-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 42.7923 + (((tickAnim - 9) / 9) * (27.9451-(42.7923)));
            zz = -118.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80 + (((tickAnim - 9) / 9) * (-12.8364-(-118.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 14.6814 + (((tickAnim - 18) / 22) * (90.0923-(14.6814)));
            yy = 27.9451 + (((tickAnim - 18) / 22) * (9.5574-(27.9451)));
            zz = -12.8364 + (((tickAnim - 18) / 22) * (-71.0447-(-12.8364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 4.8062 + (((tickAnim - 0) / 9) * (0-(4.8062)));
            yy = 18.7646 + (((tickAnim - 0) / 9) * (16.75-(18.7646)));
            zz = -6.6042 + (((tickAnim - 0) / 9) * (0-(-6.6042)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (22.4339-(0)));
            yy = 16.75 + (((tickAnim - 9) / 9) * (31.106-(16.75)));
            zz = 0 + (((tickAnim - 9) / 9) * (1.0994-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 22.4339 + (((tickAnim - 18) / 22) * (4.8062-(22.4339)));
            yy = 31.106 + (((tickAnim - 18) / 22) * (18.7646-(31.106)));
            zz = 1.0994 + (((tickAnim - 18) / 22) * (-6.6042-(1.0994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0.075-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.075 + (((tickAnim - 18) / 22) * (0-(0.075)));
            zz = 0.15 + (((tickAnim - 18) / 22) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -71.5291 + (((tickAnim - 0) / 4) * (-31.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-71.5291)));
            yy = 35.2583 + (((tickAnim - 0) / 4) * (35.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(35.2583)));
            zz = -59.2859 + (((tickAnim - 0) / 4) * (-37.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-59.2859)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -31.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 4) / 5) * (79.8401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-31.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 35.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 4) / 5) * (-0.9661-(35.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            zz = -37.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 4) / 5) * (6.2673-(-37.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 79.8401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 9) / 9) * (-36.5433-(79.8401-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -0.9661 + (((tickAnim - 9) / 9) * (15.4054-(-0.9661)));
            zz = 6.2673 + (((tickAnim - 9) / 9) * (-29.1298-(6.2673)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -36.5433 + (((tickAnim - 18) / 12) * (-68.3618-(-36.5433)));
            yy = 15.4054 + (((tickAnim - 18) / 12) * (33.0163-(15.4054)));
            zz = -29.1298 + (((tickAnim - 18) / 12) * (-49.652-(-29.1298)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -68.3618 + (((tickAnim - 30) / 10) * (-71.5291-(-68.3618)));
            yy = 33.0163 + (((tickAnim - 30) / 10) * (35.2583-(33.0163)));
            zz = -49.652 + (((tickAnim - 30) / 10) * (-59.2859-(-49.652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.1 + (((tickAnim - 0) / 4) * (0-(0.1)));
            yy = -0.45 + (((tickAnim - 0) / 4) * (0-(-0.45)));
            zz = -0.025 + (((tickAnim - 0) / 4) * (0-(-0.025)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0.2-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0.2 + (((tickAnim - 18) / 12) * (0.14-(0.2)));
            yy = -0.275 + (((tickAnim - 18) / 12) * (-0.73-(-0.275)));
            zz = 0.425 + (((tickAnim - 18) / 12) * (0.15-(0.425)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.14 + (((tickAnim - 30) / 10) * (0.1-(0.14)));
            yy = -0.73 + (((tickAnim - 30) / 10) * (-0.45-(-0.73)));
            zz = 0.15 + (((tickAnim - 30) / 10) * (-0.025-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 24 + (((tickAnim - 0) / 18) * (0-(24)));
            yy = 39 + (((tickAnim - 0) / 18) * (-29-(39)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (60.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80-(0)));
            yy = -29 + (((tickAnim - 18) / 11) * (15.05-(-29)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 60.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80 + (((tickAnim - 29) / 11) * (24-(60.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*80)));
            yy = 15.05 + (((tickAnim - 29) / 11) * (39-(15.05)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (43.6017-(0)));
            yy = 27.25 + (((tickAnim - 0) / 18) * (28.6882-(27.25)));
            zz = 0 + (((tickAnim - 0) / 18) * (-3.6478-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 43.6017 + (((tickAnim - 18) / 11) * (109.3079-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(43.6017)));
            yy = 28.6882 + (((tickAnim - 18) / 11) * (-0.7394-(28.6882)));
            zz = -3.6478 + (((tickAnim - 18) / 11) * (-0.8141-(-3.6478)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 109.3079-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 29) / 11) * (0-(109.3079-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = -0.7394 + (((tickAnim - 29) / 11) * (27.25-(-0.7394)));
            zz = -0.8141 + (((tickAnim - 29) / 11) * (0-(-0.8141)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.125 + (((tickAnim - 18) / 22) * (0-(0.125)));
            zz = 0.3 + (((tickAnim - 18) / 22) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -49.9324 + (((tickAnim - 0) / 18) * (-53.9279-(-49.9324)));
            yy = -0.2158 + (((tickAnim - 0) / 18) * (-24.2236-(-0.2158)));
            zz = -62.2675 + (((tickAnim - 0) / 18) * (-52.1837-(-62.2675)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -53.9279 + (((tickAnim - 18) / 7) * (0-(-53.9279)));
            yy = -24.2236 + (((tickAnim - 18) / 7) * (-27.975-(-24.2236)));
            zz = -52.1837 + (((tickAnim - 18) / 7) * (0-(-52.1837)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-49.9324-(0)));
            yy = -27.975 + (((tickAnim - 25) / 15) * (-0.2158-(-27.975)));
            zz = 0 + (((tickAnim - 25) / 15) * (-62.2675-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0.45 + (((tickAnim - 0) / 18) * (0.45-(0.45)));
            yy = -0.35 + (((tickAnim - 0) / 18) * (-0.25-(-0.35)));
            zz = 0.35 + (((tickAnim - 0) / 18) * (-0.3-(0.35)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.45 + (((tickAnim - 18) / 7) * (0-(0.45)));
            yy = -0.25 + (((tickAnim - 18) / 7) * (0-(-0.25)));
            zz = -0.3 + (((tickAnim - 18) / 7) * (0-(-0.3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0.45-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraShachemys entity = (EntityPrehistoricFloraShachemys) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 0) / 2) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 0) / 2) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 2) / 3) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 2) / 3) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 2) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 5) / 1) * (-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 5) / 1) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 6) / 2) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 6) / 2) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 6) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 8) / 2) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 8) / 2) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3 + (((tickAnim - 10) / 1) * (-1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-60))*3)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7 + (((tickAnim - 10) / 1) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-60))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 0) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1 + (((tickAnim - 0) / 1) * (1.2-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 1) / 3) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2 + (((tickAnim - 1) / 3) * (1.2-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 1) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 4) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2 + (((tickAnim - 4) / 1) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 4) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 5) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1 + (((tickAnim - 5) / 1) * (1.2-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 5) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 6) / 4) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2 + (((tickAnim - 6) / 4) * (1.2-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 6) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2 + (((tickAnim - 10) / 1) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*666-20))*-0.2)));
            yy = 1.2 + (((tickAnim - 10) / 1) * (1.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.1-(1.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3 + (((tickAnim - 10) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*666/0.5-20))*-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666/0.5-20))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666-20))*7), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666-10))*7));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-7.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666/0.5-80))*-2), neck2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666-20))*-15), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666-10))*-7));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7.25), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.2256 + (((tickAnim - 0) / 5) * (90.7502-(3.2256)));
            yy = -55.1394 + (((tickAnim - 0) / 5) * (-46.8098-(-55.1394)));
            zz = 3.6195 + (((tickAnim - 0) / 5) * (68.762-(3.6195)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 90.7502 + (((tickAnim - 5) / 3) * (-327.7707-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*350-(90.7502)));
            yy = -46.8098 + (((tickAnim - 5) / 3) * (-41.0591-(-46.8098)));
            zz = 68.762 + (((tickAnim - 5) / 3) * (41.5943+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80-(68.762)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -327.7707-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*350 + (((tickAnim - 8) / 2) * (2.9054-(-327.7707-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*350)));
            yy = -41.0591 + (((tickAnim - 8) / 2) * (-59.28-(-41.0591)));
            zz = 41.5943+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80 + (((tickAnim - 8) / 2) * (1.8279-(41.5943+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-80)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 2.9054 + (((tickAnim - 10) / 1) * (3.2256-(2.9054)));
            yy = -59.28 + (((tickAnim - 10) / 1) * (-55.1394-(-59.28)));
            zz = 1.8279 + (((tickAnim - 10) / 1) * (3.6195-(1.8279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 17.2981 + (((tickAnim - 0) / 5) * (32.5553-(17.2981)));
            yy = -29.1419 + (((tickAnim - 0) / 5) * (-23.4616-(-29.1419)));
            zz = 0.7209 + (((tickAnim - 0) / 5) * (6.2614-(0.7209)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5553 + (((tickAnim - 5) / 3) * (0-(32.5553)));
            yy = -23.4616 + (((tickAnim - 5) / 3) * (-29.25-(-23.4616)));
            zz = 6.2614 + (((tickAnim - 5) / 3) * (0-(6.2614)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (17.2981-(0)));
            yy = -29.25 + (((tickAnim - 8) / 2) * (-29.1419-(-29.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.7209-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 17.2981 + (((tickAnim - 10) / 1) * (17.2981-(17.2981)));
            yy = -29.1419 + (((tickAnim - 10) / 1) * (-29.1419-(-29.1419)));
            zz = 0.7209 + (((tickAnim - 10) / 1) * (0.7209-(0.7209)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 5) * (0-(0.075)));
            zz = 0.15 + (((tickAnim - 0) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.075-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 10) / 1) * (0.075-(0.075)));
            zz = 0.15 + (((tickAnim - 10) / 1) * (0.15-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -22.4393 + (((tickAnim - 0) / 3) * (-65.883-(-22.4393)));
            yy = 0.2632 + (((tickAnim - 0) / 3) * (-33.7525-(0.2632)));
            zz = 13.3439 + (((tickAnim - 0) / 3) * (45.0307-(13.3439)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -65.883 + (((tickAnim - 3) / 2) * (35.8842-(-65.883)));
            yy = -33.7525 + (((tickAnim - 3) / 2) * (9.0514-(-33.7525)));
            zz = 45.0307 + (((tickAnim - 3) / 2) * (-1.9399-(45.0307)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 35.8842 + (((tickAnim - 5) / 1) * (-34.881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(35.8842)));
            yy = 9.0514 + (((tickAnim - 5) / 1) * (-47.7212-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(9.0514)));
            zz = -1.9399 + (((tickAnim - 5) / 1) * (38.7453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-1.9399)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -34.881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 6) / 2) * (-33.6348-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-34.881-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -47.7212-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 6) / 2) * (-63.919-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-47.7212-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 38.7453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 6) / 2) * (48.7872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(38.7453+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -33.6348-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 8) / 2) * (-22.4393-(-33.6348-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -63.919-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 8) / 2) * (0.2632-(-63.919-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 48.7872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 8) / 2) * (13.3439-(48.7872+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -22.4393 + (((tickAnim - 10) / 1) * (-22.4393-(-22.4393)));
            yy = 0.2632 + (((tickAnim - 10) / 1) * (0.2632-(0.2632)));
            zz = 13.3439 + (((tickAnim - 10) / 1) * (13.3439-(13.3439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.175 + (((tickAnim - 0) / 5) * (0-(-0.175)));
            yy = -0.45 + (((tickAnim - 0) / 5) * (0-(-0.45)));
            zz = 0.3 + (((tickAnim - 0) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -0.175 + (((tickAnim - 10) / 1) * (-0.175-(-0.175)));
            yy = -0.45 + (((tickAnim - 10) / 1) * (-0.45-(-0.45)));
            zz = 0.3 + (((tickAnim - 10) / 1) * (0.3-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 29 + (((tickAnim - 0) / 3) * (-20.25-(29)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 3) * (0.7032-(5.3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -20.25 + (((tickAnim - 3) / 3) * (-50.4521-(-20.25)));
            zz = 0 + (((tickAnim - 3) / 3) * (-23.981-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.7032 + (((tickAnim - 6) / 5) * (0-(0.7032)));
            yy = -50.4521 + (((tickAnim - 6) / 5) * (29-(-50.4521)));
            zz = -23.981 + (((tickAnim - 6) / 5) * (0-(-23.981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.7451 + (((tickAnim - 0) / 3) * (24.6329-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(11.7451)));
            yy = -30.1917 + (((tickAnim - 0) / 3) * (0.7394-(-30.1917)));
            zz = 11.0062 + (((tickAnim - 0) / 3) * (0.8141-(11.0062)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 24.6329-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 3) / 3) * (0-(24.6329-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0.7394 + (((tickAnim - 3) / 3) * (-27.25-(0.7394)));
            zz = 0.8141 + (((tickAnim - 3) / 3) * (0-(0.8141)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (11.7451-(0)));
            yy = -27.25 + (((tickAnim - 6) / 5) * (-30.1917-(-27.25)));
            zz = 0 + (((tickAnim - 6) / 5) * (11.0062-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 6) * (0-(-0.15)));
            zz = 0.125 + (((tickAnim - 0) / 6) * (0-(0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9 + (((tickAnim - 0) / 2) * (13.9185-(9)));
            yy = 39.5 + (((tickAnim - 0) / 2) * (50.532-(39.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (-4.5701-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 13.9185 + (((tickAnim - 2) / 4) * (-36.9961-(13.9185)));
            yy = 50.532 + (((tickAnim - 2) / 4) * (2.4823-(50.532)));
            zz = -4.5701 + (((tickAnim - 2) / 4) * (55.4278-(-4.5701)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -36.9961 + (((tickAnim - 6) / 5) * (9-(-36.9961)));
            yy = 2.4823 + (((tickAnim - 6) / 5) * (39.5-(2.4823)));
            zz = 55.4278 + (((tickAnim - 6) / 5) * (0-(55.4278)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-0.45-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0.15-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -0.45 + (((tickAnim - 6) / 5) * (0-(-0.45)));
            yy = -0.125 + (((tickAnim - 6) / 5) * (0-(-0.125)));
            zz = 0.15 + (((tickAnim - 6) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666/0.5-120))*3), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666))*-7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*666-120))*7));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 90.7502 + (((tickAnim - 0) / 3) * (-210.6508-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350-(90.7502)));
            yy = 46.8098 + (((tickAnim - 0) / 3) * (48.8264-(46.8098)));
            zz = -68.762 + (((tickAnim - 0) / 3) * (-104.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80-(-68.762)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -210.6508-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350 + (((tickAnim - 3) / 2) * (2.9054-(-210.6508-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*350)));
            yy = 48.8264 + (((tickAnim - 3) / 2) * (59.28-(48.8264)));
            zz = -104.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80 + (((tickAnim - 3) / 2) * (-1.8279-(-104.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*80)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 2.9054 + (((tickAnim - 5) / 6) * (90.7502-(2.9054)));
            yy = 59.28 + (((tickAnim - 5) / 6) * (46.8098-(59.28)));
            zz = -1.8279 + (((tickAnim - 5) / 6) * (-68.762-(-1.8279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.5553 + (((tickAnim - 0) / 3) * (0-(32.5553)));
            yy = 23.4616 + (((tickAnim - 0) / 3) * (16.75-(23.4616)));
            zz = -6.2614 + (((tickAnim - 0) / 3) * (0-(-6.2614)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (22.4339-(0)));
            yy = 16.75 + (((tickAnim - 3) / 2) * (31.106-(16.75)));
            zz = 0 + (((tickAnim - 3) / 2) * (1.0994-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 22.4339 + (((tickAnim - 5) / 6) * (32.5553-(22.4339)));
            yy = 31.106 + (((tickAnim - 5) / 6) * (23.4616-(31.106)));
            zz = 1.0994 + (((tickAnim - 5) / 6) * (-6.2614-(1.0994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.075-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 6) * (0-(0.075)));
            zz = 0.15 + (((tickAnim - 5) / 6) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 35.8842 + (((tickAnim - 0) / 1) * (54.8567-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(35.8842)));
            yy = -9.0514 + (((tickAnim - 0) / 1) * (-11.5966-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(-9.0514)));
            zz = 1.9399 + (((tickAnim - 0) / 1) * (11.1844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(1.9399)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 54.8567-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 1) / 2) * (-7.9316-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(54.8567-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = -11.5966-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 1) / 2) * (-38.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-11.5966-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            zz = 11.1844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 1) / 2) * (18.352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(11.1844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.9316-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 3) / 2) * (-29.4685-(-7.9316-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = -38.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 3) / 2) * (-3.4753-(-38.8691-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            zz = 18.352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 3) / 2) * (-16.2343-(18.352+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -29.4685 + (((tickAnim - 5) / 3) * (-72.6046-(-29.4685)));
            yy = -3.4753 + (((tickAnim - 5) / 3) * (31.6633-(-3.4753)));
            zz = -16.2343 + (((tickAnim - 5) / 3) * (-16.0184-(-16.2343)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -72.6046 + (((tickAnim - 8) / 3) * (35.8842-(-72.6046)));
            yy = 31.6633 + (((tickAnim - 8) / 3) * (-9.0514-(31.6633)));
            zz = -16.0184 + (((tickAnim - 8) / 3) * (1.9399-(-16.0184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.175-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.175 + (((tickAnim - 5) / 3) * (0.14-(0.175)));
            yy = -0.45 + (((tickAnim - 5) / 3) * (-0.73-(-0.45)));
            zz = 0.3 + (((tickAnim - 5) / 3) * (0.15-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0.14 + (((tickAnim - 8) / 3) * (0-(0.14)));
            yy = -0.73 + (((tickAnim - 8) / 3) * (0-(-0.73)));
            zz = 0.15 + (((tickAnim - 8) / 3) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.7032 + (((tickAnim - 0) / 5) * (0-(0.7032)));
            yy = 50.4521 + (((tickAnim - 0) / 5) * (-29-(50.4521)));
            zz = 23.981 + (((tickAnim - 0) / 5) * (0-(23.981)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = -29 + (((tickAnim - 5) / 3) * (15.05-(-29)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 3) * (0.7032-(25.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 15.05 + (((tickAnim - 8) / 3) * (50.4521-(15.05)));
            zz = 0 + (((tickAnim - 8) / 3) * (23.981-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.7451-(0)));
            yy = 27.25 + (((tickAnim - 0) / 5) * (30.1917-(27.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (11.0062-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.7451 + (((tickAnim - 5) / 3) * (58.8175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(11.7451)));
            yy = 30.1917 + (((tickAnim - 5) / 3) * (24.8591-(30.1917)));
            zz = 11.0062 + (((tickAnim - 5) / 3) * (-12.0957-(11.0062)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 58.8175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 8) / 3) * (0-(58.8175-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 24.8591 + (((tickAnim - 8) / 3) * (27.25-(24.8591)));
            zz = -12.0957 + (((tickAnim - 8) / 3) * (0-(-12.0957)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 6) * (0-(0.125)));
            zz = 0.3 + (((tickAnim - 5) / 6) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.9961 + (((tickAnim - 0) / 5) * (9-(-36.9961)));
            yy = -2.4823 + (((tickAnim - 0) / 5) * (-39.5-(-2.4823)));
            zz = -55.4278 + (((tickAnim - 0) / 5) * (0-(-55.4278)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 9 + (((tickAnim - 5) / 2) * (0-(9)));
            yy = -39.5 + (((tickAnim - 5) / 2) * (-27.975-(-39.5)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (-36.9961-(0)));
            yy = -27.975 + (((tickAnim - 7) / 4) * (-2.4823-(-27.975)));
            zz = 0 + (((tickAnim - 7) / 4) * (-55.4278-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.45 + (((tickAnim - 0) / 5) * (0-(0.45)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (0-(-0.125)));
            zz = 0.15 + (((tickAnim - 0) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0.45-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraShachemys e = (EntityPrehistoricFloraShachemys) entity;
        animator.update(entity);


    }
}
