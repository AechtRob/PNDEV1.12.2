package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPholidosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPholidosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelPholidosaurus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 22.15F, 3.5F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, -0.275F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 44, -1.5F, -5.75F, -4.0F, 3, 1, 5, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 25, -1.5F, -5.5F, -4.0F, 3, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 24, -2.5F, -5.0F, -4.0F, 5, 4, 5, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-2.25F, -3.55F, -0.05F);
        this.hips.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0436F, -0.3927F, -0.7854F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 46, 5, -3.6222F, -0.342F, -1.5023F, 4, 2, 3, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-3.5F, 0.25F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0956F, 0.2236F, -0.8527F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 60, 19, -2.6222F, -0.342F, -1.0023F, 3, 2, 2, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-2.35F, 0.5F, 0.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.6981F, 0.0175F, 0.0175F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 52, 31, -0.6222F, -3.092F, -2.0023F, 1, 4, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(2.25F, -3.55F, -0.05F);
        this.hips.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0436F, 0.3927F, 0.7854F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 46, 5, -0.3778F, -0.342F, -1.5023F, 4, 2, 3, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.5F, 0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0956F, -0.2236F, 0.8527F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 60, 19, -0.3778F, -0.342F, -1.0023F, 3, 2, 2, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(2.35F, 0.5F, 0.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.6981F, -0.0175F, -0.0175F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 52, 31, -0.3778F, -3.092F, -2.0023F, 1, 4, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5F, 1.25F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2443F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 24, 13, -1.5F, -1.0F, -1.0F, 3, 4, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 50, 44, -1.0F, -1.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 50, 44, 1.0F, -1.5F, 0.0F, 0, 1, 6, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 0, -1.0F, -0.5F, -1.0F, 2, 3, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 10, -0.6F, -2.0F, -1.0F, 0, 2, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 10, 0.6F, -2.0F, -1.0F, 0, 2, 7, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 42, -0.5F, -0.5F, -1.0F, 1, 2, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 50, -0.35F, -2.0F, -0.5F, 0, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 34, 50, 0.35F, -2.0F, -0.5F, 0, 2, 6, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.225F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0698F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 33, 0.0F, -2.0F, -0.5F, 0, 3, 8, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 48, -0.5F, 0.0F, -0.5F, 1, 1, 6, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, -3.75F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.25F, -7.0F, 6, 5, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 13, -2.0F, -1.475F, -7.0F, 4, 1, 8, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -2.0F, -1.725F, -7.0F, 4, 1, 8, -0.02F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.25F, -7.0F);
        this.body.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.3F, 0.2F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -2.0F, 1.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.375F, -0.1F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 58, 10, -1.5F, -2.25F, -2.475F, 3, 1, 3, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 57, -1.5F, -2.0F, -2.725F, 3, 1, 3, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.65F, -0.1F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 40, -2.5F, -2.0F, -3.0F, 5, 4, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.5F, 1.9F, -1.4F);
        this.chest.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, -0.288F, -1.1345F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 46, 51, -0.5F, -0.75F, -1.5F, 2, 2, 4, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.35F, -0.25F, 1.75F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -1.1345F, -0.3054F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 58, 14, -0.75F, -0.75F, 0.0F, 2, 2, 3, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.25F, 0.0F, 2.5F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.1309F, 0.0873F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 22, 61, -2.25F, -1.25F, 0.0F, 3, 3, 1, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.5F, 1.9F, -1.4F);
        this.chest.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, -0.288F, 1.1345F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 46, 51, -1.5F, -0.75F, -1.5F, 2, 2, 4, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(-0.35F, -0.25F, 1.75F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -1.1345F, 0.3054F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 58, 14, -1.25F, -0.75F, 0.0F, 2, 2, 3, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(-0.25F, 0.0F, 2.5F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.1309F, -0.0873F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 22, 61, -0.75F, -1.25F, 0.0F, 3, 3, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.65F, -3.1F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 45, 19, -2.0F, -1.8F, -2.25F, 4, 3, 3, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 64, 35, -2.25F, -1.3F, -2.2F, 1, 3, 3, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 64, 35, 1.25F, -1.3F, -2.2F, 1, 3, 3, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.125F, -0.25F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0785F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 51, -2.0F, 0.0F, -2.0F, 4, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.025F, -0.15F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 5, -1.0F, -2.25F, -2.0F, 2, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 60, -1.0F, -2.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8F, -2.25F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 34, 58, -1.0F, -0.25F, -3.0F, 2, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 31, -0.5F, -0.25F, -10.25F, 1, 1, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.25F, -10.25F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 31, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.075F, -2.4F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 10, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.075F, -0.75F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 55, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.925F, 0.75F, -2.075F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1571F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 51, -2.0F, -1.0F, -0.25F, 2, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.75F, -4.7F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.5323F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 60, 23, -1.0F, -1.0F, -0.25F, 1, 1, 3, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.85F, -10.375F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.6981F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 12, -0.75F, 0.0F, -0.55F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.75F, -8.25F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.6981F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 55, -0.75F, 0.0F, -1.25F, 1, 0, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.925F, 0.75F, -2.075F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1571F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 51, 0.0F, -1.0F, -0.25F, 2, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.75F, -4.7F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.5323F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 23, 0.0F, -1.0F, -0.25F, 1, 1, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.85F, -10.375F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2618F, 0.0F, -0.6981F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 12, -0.25F, 0.0F, -0.55F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.75F, -8.25F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.6981F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 55, -0.25F, 0.0F, -1.25F, 1, 0, 5, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.075F, 0.15F, -3.3F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.1309F, -0.4363F, 0.2182F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 34, 10, -1.0F, -0.75F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.075F, 0.15F, -3.3F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.1309F, 0.4363F, -0.2182F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 34, 10, 0.0F, -0.75F, 0.0F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.725F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 33, -0.5F, 0.0F, -10.5F, 1, 1, 8, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 55, -0.4F, -0.25F, -9.9F, 0, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 55, 0.4F, -0.25F, -9.9F, 0, 1, 5, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 55, -1.0F, 0.0F, -2.75F, 2, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 59, -1.5F, -1.475F, -1.75F, 3, 2, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.0F, -4.45F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.5323F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 27, -1.025F, -1.0F, -0.25F, 1, 1, 3, -0.02F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.875F, 0.925F, -1.825F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1963F, 0.1571F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 61, 45, -1.0F, -1.0F, -0.25F, 1, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.875F, 0.925F, -1.825F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1963F, -0.1571F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 61, 45, 0.0F, -1.0F, -0.25F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.9F, 1.0F, -1.825F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1571F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 59, -1.975F, -1.0F, -0.25F, 2, 1, 3, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.9F, 1.0F, -1.825F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1571F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 59, -0.025F, -1.0F, -0.25F, 2, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.0F, -4.45F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.5323F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 27, 0.025F, -1.0F, -0.25F, 1, 1, 3, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.95F, -3.25F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.2138F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.075F, 1.0F);
        this.throat.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0175F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 52, 39, -1.0F, -1.0F, -1.05F, 2, 1, 4, 0.01F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.2F;
        this.hips.offsetX = 0.36F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(120);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.hips.rotateAngleX = (float) Math.toRadians(90);
        this.hips.offsetY = -0.2F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.105F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraPholidosaurus entityPholidosaurus = (EntityPrehistoricFloraPholidosaurus) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        entityPholidosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityPholidosaurus.getAnimation() == entityPholidosaurus.LAY_ANIMATION || entityPholidosaurus.getAnimation() == entityPholidosaurus.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entityPholidosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityPholidosaurus.getIsMoving()) {
                    if (entityPholidosaurus.getAnimation() != entityPholidosaurus.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityPholidosaurus.getIsFast()) { //Running


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
        this.eyeleft.setScale(1,1,1);
        this.eyeright.setScale(1,1,1);

        EntityPrehistoricFloraPholidosaurus ee = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.3125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.0625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.3125 + (((tickAnim - 3) / 4) * (-4.3386-(-13.3125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.2048-(0)));
            zz = -1.0625 + (((tickAnim - 3) / 4) * (-5.8262-(-1.0625)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.3386 + (((tickAnim - 7) / 3) * (-6.75-(-4.3386)));
            yy = 0.2048 + (((tickAnim - 7) / 3) * (0-(0.2048)));
            zz = -5.8262 + (((tickAnim - 7) / 3) * (-4.25-(-5.8262)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -6.75 + (((tickAnim - 10) / 4) * (-9.4063-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 4) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -9.4063 + (((tickAnim - 14) / 7) * (-8.4063-(-9.4063)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 14) / 7) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -8.4063 + (((tickAnim - 21) / 6) * (-13.3125-(-8.4063)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 21) / 6) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -13.3125 + (((tickAnim - 27) / 4) * (0-(-13.3125)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 27) / 4) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.9689-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.5076-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.6432-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (27-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (0-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-12.25-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 27 + (((tickAnim - 10) / 4) * (-12.7269-(27)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.772-(0)));
            zz = -12.25 + (((tickAnim - 10) / 4) * (3.4139-(-12.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.7269 + (((tickAnim - 14) / 4) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 14) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 14) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.5 + (((tickAnim - 18) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 21) / 3) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.772-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (3.4139-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.7269 + (((tickAnim - 24) / 4) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 24) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 24) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 7) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 14) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 29.25 + (((tickAnim - 24) / 4) * (0-(29.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 0) / 17) * (13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 65) {
            xx = 13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20 + (((tickAnim - 17) / 48) * (0-(13.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+80))*20)));
            yy = 0 + (((tickAnim - 17) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 4.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 7) / 10) * (-7.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(4.095-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 10) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 53) {
            xx = -7.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 17) / 36) * (-28.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(-7.45-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 17) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 36) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -28.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 53) / 12) * (0-(-28.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (71.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 71.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 6) * (0-(71.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.25 + (((tickAnim - 7) / 6) * (9.75-(-1.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.75 + (((tickAnim - 13) / 4) * (5.5-(9.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 41) {
            xx = 5.5 + (((tickAnim - 17) / 24) * (-1.35-(5.5)));
            yy = 0 + (((tickAnim - 17) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 24) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 53) {
            xx = -1.35 + (((tickAnim - 41) / 12) * (4.75-(-1.35)));
            yy = 0 + (((tickAnim - 41) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 12) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 4.75 + (((tickAnim - 53) / 12) * (0-(4.75)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 4) * (0.5-(0.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05-(0)));
            zz = 0.5 + (((tickAnim - 17) / 11) * (0.5-(0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05 + (((tickAnim - 28) / 13) * (-0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1500))*-0.05)));
            zz = 0.5 + (((tickAnim - 28) / 13) * (0.25-(0.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 41) / 24) * (0-(0)));
            yy = -0.05 + (((tickAnim - 41) / 24) * (0-(-0.05)));
            zz = 0.25 + (((tickAnim - 41) / 24) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-4.73-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = -4.73 + (((tickAnim - 19) / 31) * (2-(-4.73)));
            yy = 0 + (((tickAnim - 19) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 31) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 2 + (((tickAnim - 50) / 510) * (2-(2)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 2 + (((tickAnim - 560) / 40) * (0-(2)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-1.85-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (2.475-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -1.85 + (((tickAnim - 50) / 510) * (-1.85-(-1.85)));
            zz = 2.475 + (((tickAnim - 50) / 510) * (2.475-(2.475)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -1.85 + (((tickAnim - 560) / 40) * (0-(-1.85)));
            zz = 2.475 + (((tickAnim - 560) / 40) * (0-(2.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2.7861-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-10.7824-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (9.6475-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 2.7861 + (((tickAnim - 19) / 31) * (-24.7359-(2.7861)));
            yy = -10.7824 + (((tickAnim - 19) / 31) * (-22.6166-(-10.7824)));
            zz = 9.6475 + (((tickAnim - 19) / 31) * (38.2559-(9.6475)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -24.7359 + (((tickAnim - 50) / 510) * (-24.7359-(-24.7359)));
            yy = -22.6166 + (((tickAnim - 50) / 510) * (-22.6166-(-22.6166)));
            zz = 38.2559 + (((tickAnim - 50) / 510) * (38.2559-(38.2559)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -24.7359 + (((tickAnim - 560) / 40) * (0-(-24.7359)));
            yy = -22.6166 + (((tickAnim - 560) / 40) * (0-(-22.6166)));
            zz = 38.2559 + (((tickAnim - 560) / 40) * (0-(38.2559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.394-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (10.4925-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-35.4315-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -0.394 + (((tickAnim - 50) / 510) * (-0.394-(-0.394)));
            yy = 10.4925 + (((tickAnim - 50) / 510) * (10.4925-(10.4925)));
            zz = -35.4315 + (((tickAnim - 50) / 510) * (-35.4315-(-35.4315)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -0.394 + (((tickAnim - 560) / 40) * (0-(-0.394)));
            yy = 10.4925 + (((tickAnim - 560) / 40) * (0-(10.4925)));
            zz = -35.4315 + (((tickAnim - 560) / 40) * (0-(-35.4315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -0.2 + (((tickAnim - 50) / 510) * (-0.2-(-0.2)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -0.2 + (((tickAnim - 560) / 40) * (0-(-0.2)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2.7861-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (10.7824-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-9.6475-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 2.7861 + (((tickAnim - 19) / 31) * (-24.7359-(2.7861)));
            yy = 10.7824 + (((tickAnim - 19) / 31) * (22.6166-(10.7824)));
            zz = -9.6475 + (((tickAnim - 19) / 31) * (-38.2559-(-9.6475)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -24.7359 + (((tickAnim - 50) / 510) * (-24.7359-(-24.7359)));
            yy = 22.6166 + (((tickAnim - 50) / 510) * (22.6166-(22.6166)));
            zz = -38.2559 + (((tickAnim - 50) / 510) * (-38.2559-(-38.2559)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -24.7359 + (((tickAnim - 560) / 40) * (0-(-24.7359)));
            yy = 22.6166 + (((tickAnim - 560) / 40) * (0-(22.6166)));
            zz = -38.2559 + (((tickAnim - 560) / 40) * (0-(-38.2559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.394-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-10.4925-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (35.4315-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -0.394 + (((tickAnim - 50) / 510) * (-0.394-(-0.394)));
            yy = -10.4925 + (((tickAnim - 50) / 510) * (-10.4925-(-10.4925)));
            zz = 35.4315 + (((tickAnim - 50) / 510) * (35.4315-(35.4315)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -0.394 + (((tickAnim - 560) / 40) * (0-(-0.394)));
            yy = -10.4925 + (((tickAnim - 560) / 40) * (0-(-10.4925)));
            zz = 35.4315 + (((tickAnim - 560) / 40) * (0-(35.4315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0.2-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0.2 + (((tickAnim - 50) / 510) * (0.2-(0.2)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0.2 + (((tickAnim - 560) / 40) * (0-(0.2)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.8858-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.804-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.2461-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 7.8858 + (((tickAnim - 19) / 31) * (5.9738-(7.8858)));
            yy = -1.804 + (((tickAnim - 19) / 31) * (-4.7061-(-1.804)));
            zz = 0.2461 + (((tickAnim - 19) / 31) * (0.642-(0.2461)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 5.9738 + (((tickAnim - 50) / 510) * (5.9738-(5.9738)));
            yy = -4.7061 + (((tickAnim - 50) / 510) * (-4.7061-(-4.7061)));
            zz = 0.642 + (((tickAnim - 50) / 510) * (0.642-(0.642)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 5.9738 + (((tickAnim - 560) / 40) * (0-(5.9738)));
            yy = -4.7061 + (((tickAnim - 560) / 40) * (0-(-4.7061)));
            zz = 0.642 + (((tickAnim - 560) / 40) * (0-(0.642)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-15 + (((tickAnim - 0) / 50) * (-9-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-15)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = -9 + (((tickAnim - 50) / 510) * (-9-(-9)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -9 + (((tickAnim - 560) / 40) * (0-(-9)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-8.0235-(0)));
            yy = 15.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-20 + (((tickAnim - 0) / 50) * (-10.2997-(15.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.1552-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -8.0235 + (((tickAnim - 50) / 10) * (-8.0272-(-8.0235)));
            yy = -10.2997 + (((tickAnim - 50) / 10) * (-18.4997-(-10.2997)));
            zz = 0.1552 + (((tickAnim - 50) / 10) * (0.1672-(0.1552)));
        }
        else if (tickAnim >= 60 && tickAnim < 560) {
            xx = -8.0272 + (((tickAnim - 60) / 500) * (-8.0235-(-8.0272)));
            yy = -18.4997 + (((tickAnim - 60) / 500) * (-10.2997-(-18.4997)));
            zz = 0.1672 + (((tickAnim - 60) / 500) * (0.1552-(0.1672)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -8.0235 + (((tickAnim - 560) / 40) * (0-(-8.0235)));
            yy = -10.2997 + (((tickAnim - 560) / 40) * (0-(-10.2997)));
            zz = 0.1552 + (((tickAnim - 560) / 40) * (0-(0.1552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 103.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-105 + (((tickAnim - 0) / 50) * (-7.35-(103.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-105)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -7.35 + (((tickAnim - 50) / 10) * (-25.5-(-7.35)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 60) / 500) * (0-(0)));
            yy = -25.5 + (((tickAnim - 60) / 500) * (-7.35-(-25.5)));
            zz = 0 + (((tickAnim - 60) / 500) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = -7.35 + (((tickAnim - 560) / 40) * (0-(-7.35)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 19) / 31) * (0-(7.25)));
            yy = 0 + (((tickAnim - 19) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 31) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-2.51-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = -2.51 + (((tickAnim - 19) / 31) * (6.5-(-2.51)));
            yy = 0 + (((tickAnim - 19) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 31) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 6.5 + (((tickAnim - 50) / 510) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 6.5 + (((tickAnim - 560) / 40) * (0-(6.5)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.4552-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-9.441-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (3.1332-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 8.4552 + (((tickAnim - 19) / 31) * (36.088-(8.4552)));
            yy = -9.441 + (((tickAnim - 19) / 31) * (-14.2643-(-9.441)));
            zz = 3.1332 + (((tickAnim - 19) / 31) * (-4.0755-(3.1332)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 36.088 + (((tickAnim - 50) / 510) * (36.088-(36.088)));
            yy = -14.2643 + (((tickAnim - 50) / 510) * (-14.2643-(-14.2643)));
            zz = -4.0755 + (((tickAnim - 50) / 510) * (-4.0755-(-4.0755)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 36.088 + (((tickAnim - 560) / 40) * (0-(36.088)));
            yy = -14.2643 + (((tickAnim - 560) / 40) * (0-(-14.2643)));
            zz = -4.0755 + (((tickAnim - 560) / 40) * (0-(-4.0755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-23.4891-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (7.4604-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (25.8139-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = -23.4891 + (((tickAnim - 19) / 31) * (-25.4064-(-23.4891)));
            yy = 7.4604 + (((tickAnim - 19) / 31) * (19.462-(7.4604)));
            zz = 25.8139 + (((tickAnim - 19) / 31) * (67.3405-(25.8139)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -25.4064 + (((tickAnim - 50) / 510) * (-25.4064-(-25.4064)));
            yy = 19.462 + (((tickAnim - 50) / 510) * (19.462-(19.462)));
            zz = 67.3405 + (((tickAnim - 50) / 510) * (67.3405-(67.3405)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -25.4064 + (((tickAnim - 560) / 40) * (0-(-25.4064)));
            yy = 19.462 + (((tickAnim - 560) / 40) * (0-(19.462)));
            zz = 67.3405 + (((tickAnim - 560) / 40) * (0-(67.3405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -0.5 + (((tickAnim - 50) / 510) * (-0.5-(-0.5)));
            yy = -0.25 + (((tickAnim - 50) / 510) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -0.5 + (((tickAnim - 560) / 40) * (0-(-0.5)));
            yy = -0.25 + (((tickAnim - 560) / 40) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.4292-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (19.5486-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-4.641-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 5.4292 + (((tickAnim - 19) / 31) * (-18.4456-(5.4292)));
            yy = 19.5486 + (((tickAnim - 19) / 31) * (50.9963-(19.5486)));
            zz = -4.641 + (((tickAnim - 19) / 31) * (-12.1069-(-4.641)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -18.4456 + (((tickAnim - 50) / 510) * (-18.4456-(-18.4456)));
            yy = 50.9963 + (((tickAnim - 50) / 510) * (50.9963-(50.9963)));
            zz = -12.1069 + (((tickAnim - 50) / 510) * (-12.1069-(-12.1069)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -18.4456 + (((tickAnim - 560) / 40) * (0-(-18.4456)));
            yy = 50.9963 + (((tickAnim - 560) / 40) * (0-(50.9963)));
            zz = -12.1069 + (((tickAnim - 560) / 40) * (0-(-12.1069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.3-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -0.3 + (((tickAnim - 50) / 510) * (-0.3-(-0.3)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = -0.3 + (((tickAnim - 50) / 510) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -0.3 + (((tickAnim - 560) / 40) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = -0.3 + (((tickAnim - 560) / 40) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.4552-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (9.441-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-3.1332-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 8.4552 + (((tickAnim - 19) / 31) * (36.088-(8.4552)));
            yy = 9.441 + (((tickAnim - 19) / 31) * (14.2643-(9.441)));
            zz = -3.1332 + (((tickAnim - 19) / 31) * (4.0755-(-3.1332)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 36.088 + (((tickAnim - 50) / 510) * (36.088-(36.088)));
            yy = 14.2643 + (((tickAnim - 50) / 510) * (14.2643-(14.2643)));
            zz = 4.0755 + (((tickAnim - 50) / 510) * (4.0755-(4.0755)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 36.088 + (((tickAnim - 560) / 40) * (0-(36.088)));
            yy = 14.2643 + (((tickAnim - 560) / 40) * (0-(14.2643)));
            zz = 4.0755 + (((tickAnim - 560) / 40) * (0-(4.0755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-23.4891-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-7.4604-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-25.8139-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = -23.4891 + (((tickAnim - 19) / 31) * (-25.4064-(-23.4891)));
            yy = -7.4604 + (((tickAnim - 19) / 31) * (-19.462-(-7.4604)));
            zz = -25.8139 + (((tickAnim - 19) / 31) * (-67.3405-(-25.8139)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -25.4064 + (((tickAnim - 50) / 510) * (-25.4064-(-25.4064)));
            yy = -19.462 + (((tickAnim - 50) / 510) * (-19.462-(-19.462)));
            zz = -67.3405 + (((tickAnim - 50) / 510) * (-67.3405-(-67.3405)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -25.4064 + (((tickAnim - 560) / 40) * (0-(-25.4064)));
            yy = -19.462 + (((tickAnim - 560) / 40) * (0-(-19.462)));
            zz = -67.3405 + (((tickAnim - 560) / 40) * (0-(-67.3405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0.5 + (((tickAnim - 50) / 510) * (0.5-(0.5)));
            yy = -0.25 + (((tickAnim - 50) / 510) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 50) / 510) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0.5 + (((tickAnim - 560) / 40) * (0-(0.5)));
            yy = -0.25 + (((tickAnim - 560) / 40) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5.4292-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-19.5486-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (4.641-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 50) {
            xx = 5.4292 + (((tickAnim - 19) / 31) * (-18.4456-(5.4292)));
            yy = -19.5486 + (((tickAnim - 19) / 31) * (-50.9963-(-19.5486)));
            zz = 4.641 + (((tickAnim - 19) / 31) * (12.1069-(4.641)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = -18.4456 + (((tickAnim - 50) / 510) * (-18.4456-(-18.4456)));
            yy = -50.9963 + (((tickAnim - 50) / 510) * (-50.9963-(-50.9963)));
            zz = 12.1069 + (((tickAnim - 50) / 510) * (12.1069-(12.1069)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -18.4456 + (((tickAnim - 560) / 40) * (0-(-18.4456)));
            yy = -50.9963 + (((tickAnim - 560) / 40) * (0-(-50.9963)));
            zz = 12.1069 + (((tickAnim - 560) / 40) * (0-(12.1069)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.3-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 560) {
            xx = 0.3 + (((tickAnim - 50) / 510) * (0.3-(0.3)));
            yy = 0 + (((tickAnim - 50) / 510) * (0-(0)));
            zz = -0.3 + (((tickAnim - 50) / 510) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = 0.3 + (((tickAnim - 560) / 40) * (0-(0.3)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = -0.3 + (((tickAnim - 560) / 40) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 25) / 13) * (15.77-(-11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 15.77 + (((tickAnim - 38) / 12) * (2.75-(15.77)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = 2.75 + (((tickAnim - 50) / 130) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 396) {
            xx = 2.75 + (((tickAnim - 180) / 216) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 180) / 216) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 216) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 2.75 + (((tickAnim - 396) / 119) * (-14.75-(2.75)));
            yy = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 560) {
            xx = -14.75 + (((tickAnim - 515) / 45) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 515) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 45) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -14.75 + (((tickAnim - 560) / 40) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (11.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 11.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 25) / 13) * (-11.88-(11.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.88 + (((tickAnim - 38) / 12) * (-3.5-(-11.88)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 180) {
            xx = -3.5 + (((tickAnim - 50) / 130) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 50) / 130) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 130) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 215) {
            xx = -3.5 + (((tickAnim - 180) / 35) * (-8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5-(-3.5)));
            yy = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 240) {
            xx = -8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5 + (((tickAnim - 215) / 25) * (-15.75-(-8.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-5)));
            yy = 0 + (((tickAnim - 215) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 25) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 396) {
            xx = -15.75 + (((tickAnim - 240) / 156) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 240) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 156) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = -15.75 + (((tickAnim - 396) / 119) * (-6.25-(-15.75)));
            yy = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 560) {
            xx = -6.25 + (((tickAnim - 515) / 45) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 515) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 45) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -6.25 + (((tickAnim - 560) / 40) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 180 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 180) / 35) * (8.75-(0)));
            yy = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 8.75 + (((tickAnim - 215) / 181) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 215) / 181) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 181) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 8.75 + (((tickAnim - 396) / 119) * (0-(8.75)));
            yy = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeright, eyeright.rotateAngleX + (float) Math.toRadians(xx), eyeright.rotateAngleY + (float) Math.toRadians(yy), eyeright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 180) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 35) * (0.2-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 0 + (((tickAnim - 215) / 181) * (0-(0)));
            yy = 0.2 + (((tickAnim - 215) / 181) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 215) / 181) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            yy = 0.2 + (((tickAnim - 396) / 119) * (0-(0.2)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else if (tickAnim >= 515 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 515) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 515) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 515) / 85) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 180 && tickAnim < 215) {
            xx = 1 + (((tickAnim - 180) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 180) / 35) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 180) / 35) * (1-(1)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 1 + (((tickAnim - 215) / 181) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 215) / 181) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 215) / 181) * (1-(1)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 1 + (((tickAnim - 396) / 119) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 396) / 119) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 396) / 119) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 180 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 180) / 35) * (8.75-(0)));
            yy = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 8.75 + (((tickAnim - 215) / 181) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 215) / 181) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 181) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 8.75 + (((tickAnim - 396) / 119) * (0-(8.75)));
            yy = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(eyeleft, eyeleft.rotateAngleX + (float) Math.toRadians(xx), eyeleft.rotateAngleY + (float) Math.toRadians(yy), eyeleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 180 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 35) * (0.2-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 0 + (((tickAnim - 215) / 181) * (0-(0)));
            yy = 0.2 + (((tickAnim - 215) / 181) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 215) / 181) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 0 + (((tickAnim - 396) / 119) * (0-(0)));
            yy = 0.2 + (((tickAnim - 396) / 119) * (0-(0.2)));
            zz = 0 + (((tickAnim - 396) / 119) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 180 && tickAnim < 215) {
            xx = 1 + (((tickAnim - 180) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 180) / 35) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 180) / 35) * (1-(1)));
        }
        else if (tickAnim >= 215 && tickAnim < 396) {
            xx = 1 + (((tickAnim - 215) / 181) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 215) / 181) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 215) / 181) * (1-(1)));
        }
        else if (tickAnim >= 396 && tickAnim < 515) {
            xx = 1 + (((tickAnim - 396) / 119) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 396) / 119) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 396) / 119) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 180) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 180) / 35) * (6.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
            yy = 0 + (((tickAnim - 180) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 35) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 240) {
            xx = 6.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 215) / 25) * (13.5-(6.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = 0 + (((tickAnim - 215) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 25) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 396) {
            xx = 13.5 + (((tickAnim - 240) / 156) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 240) / 156) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 156) * (0-(0)));
        }
        else if (tickAnim >= 396 && tickAnim < 425) {
            xx = 13.5 + (((tickAnim - 396) / 29) * (0-(13.5)));
            yy = 0 + (((tickAnim - 396) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 396) / 29) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 425) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 425) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 600) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 600) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0.4-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 38) / 562) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 562) * (0-(0)));
            zz = 0.4 + (((tickAnim - 38) / 562) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 8) * (0-(36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 7) / 2) * (-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 41.25 + (((tickAnim - 7) / 2) * (0-(41.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (4.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 9) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.575 + (((tickAnim - 7) / 2) * (0-(0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23.082-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-29.5893-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-14.3526-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 23.082 + (((tickAnim - 20) / 11) * (-6.262-(23.082)));
            yy = -29.5893 + (((tickAnim - 20) / 11) * (0.9165-(-29.5893)));
            zz = -14.3526 + (((tickAnim - 20) / 11) * (-39.3569-(-14.3526)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -6.262 + (((tickAnim - 31) / 12) * (16.3259-(-6.262)));
            yy = 0.9165 + (((tickAnim - 31) / 12) * (10.8865-(0.9165)));
            zz = -39.3569 + (((tickAnim - 31) / 12) * (6.3582-(-39.3569)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 16.3259 + (((tickAnim - 43) / 7) * (0-(16.3259)));
            yy = 10.8865 + (((tickAnim - 43) / 7) * (0-(10.8865)));
            zz = 6.3582 + (((tickAnim - 43) / 7) * (0-(6.3582)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.3073-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-40.9079-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (23.6671-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -16.3073 + (((tickAnim - 20) / 23) * (-0.1132-(-16.3073)));
            yy = -40.9079 + (((tickAnim - 20) / 23) * (7.4664-(-40.9079)));
            zz = 23.6671 + (((tickAnim - 20) / 23) * (-8.0335-(23.6671)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.1132 + (((tickAnim - 43) / 7) * (0-(-0.1132)));
            yy = 7.4664 + (((tickAnim - 43) / 7) * (0-(7.4664)));
            zz = -8.0335 + (((tickAnim - 43) / 7) * (0-(-8.0335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 19.75 + (((tickAnim - 20) / 11) * (2.0755-(19.75)));
            yy = 0 + (((tickAnim - 20) / 11) * (-28.8115-(0)));
            zz = 35 + (((tickAnim - 20) / 11) * (47.2946-(35)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = 2.0755 + (((tickAnim - 31) / 12) * (-0.177-(2.0755)));
            yy = -28.8115 + (((tickAnim - 31) / 12) * (-6.0763-(-28.8115)));
            zz = 47.2946 + (((tickAnim - 31) / 12) * (8.7224-(47.2946)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.177 + (((tickAnim - 43) / 7) * (0-(-0.177)));
            yy = -6.0763 + (((tickAnim - 43) / 7) * (0-(-6.0763)));
            zz = 8.7224 + (((tickAnim - 43) / 7) * (0-(8.7224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (-0.9-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 43) {
            xx = -0.9 + (((tickAnim - 31) / 12) * (0-(-0.9)));
            yy = 0 + (((tickAnim - 31) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 12) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 18) / 15) * (-3-(-3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -1.15 + (((tickAnim - 18) / 15) * (-1.15-(-1.15)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -1.15 + (((tickAnim - 33) / 17) * (0-(-1.15)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (21.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 21.25 + (((tickAnim - 18) / 15) * (21.25-(21.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 21.25 + (((tickAnim - 33) / 17) * (0-(21.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.0486-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.4887-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-20.9924-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.0486 + (((tickAnim - 18) / 15) * (-0.0486-(-0.0486)));
            yy = -2.4887 + (((tickAnim - 18) / 15) * (-2.4887-(-2.4887)));
            zz = -20.9924 + (((tickAnim - 18) / 15) * (-20.9924-(-20.9924)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.0486 + (((tickAnim - 33) / 17) * (0-(-0.0486)));
            yy = -2.4887 + (((tickAnim - 33) / 17) * (0-(-2.4887)));
            zz = -20.9924 + (((tickAnim - 33) / 17) * (0-(-20.9924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-21.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -21.25 + (((tickAnim - 18) / 15) * (-21.25-(-21.25)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -21.25 + (((tickAnim - 33) / 17) * (0-(-21.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.0486-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.4887-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (20.9924-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.0486 + (((tickAnim - 18) / 15) * (-0.0486-(-0.0486)));
            yy = 2.4887 + (((tickAnim - 18) / 15) * (2.4887-(2.4887)));
            zz = 20.9924 + (((tickAnim - 18) / 15) * (20.9924-(20.9924)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.0486 + (((tickAnim - 33) / 17) * (0-(-0.0486)));
            yy = 2.4887 + (((tickAnim - 33) / 17) * (0-(2.4887)));
            zz = 20.9924 + (((tickAnim - 33) / 17) * (0-(20.9924)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 33) / 17) * (0-(4.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.5 + (((tickAnim - 18) / 15) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 33) / 17) * (0-(6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6 + (((tickAnim - 18) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 33) / 17) * (0-(-6)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 18) / 15) * (-3-(-3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+20))*2), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(44.5486), backrightleg.rotateAngleY + (float) Math.toRadians(58.2985), backrightleg.rotateAngleZ + (float) Math.toRadians(13.6642));
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(0);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(-0.375);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(0), backrightleg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(-36.3926), backrightleg3.rotateAngleY + (float) Math.toRadians(4.2571), backrightleg3.rotateAngleZ + (float) Math.toRadians(-78.5232+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*5));


        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(44.5486), backleftleg.rotateAngleY + (float) Math.toRadians(-58.2985), backleftleg.rotateAngleZ + (float) Math.toRadians(-13.6642));
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(0);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(-0.375);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(0), backleftleg2.rotateAngleY + (float) Math.toRadians(0), backleftleg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*3));


        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(-36.3926), backleftleg3.rotateAngleY + (float) Math.toRadians(4.2571), backleftleg3.rotateAngleZ + (float) Math.toRadians(78.5232+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(9.75), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-7.25), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-200))*30), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-4), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*35), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-2), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-2), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(54.8371), frontrightleg.rotateAngleY + (float) Math.toRadians(40.3377), frontrightleg.rotateAngleZ + (float) Math.toRadians(-79.5222));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(32.2799-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*3), frontrightleg2.rotateAngleY + (float) Math.toRadians(15.8881), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-5.4994));
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(0);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(-0.2);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(0.25);


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(-160.4863), frontrightleg3.rotateAngleY + (float) Math.toRadians(73.5428-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*5), frontrightleg3.rotateAngleZ + (float) Math.toRadians(-87.7879));


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(54.8371), frontleftleg.rotateAngleY + (float) Math.toRadians(-40.3377), frontleftleg.rotateAngleZ + (float) Math.toRadians(79.5222));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(32.2799-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-3), frontleftleg2.rotateAngleY + (float) Math.toRadians(-15.8881), frontleftleg2.rotateAngleZ + (float) Math.toRadians(5.4994));
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(0);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(-0.2);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(0.25);


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(-160.4863), frontleftleg3.rotateAngleY + (float) Math.toRadians(-73.5428-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*5), frontleftleg3.rotateAngleZ + (float) Math.toRadians(87.7879));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262+60))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 32;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+100))*-0.59), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+100))*3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+100))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*220-50))*0.1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*220/0.5))*0.19);



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 7.7888 + (((tickAnim - 0) / 18) * (0.2979-(7.7888)));
            yy = -15.6592 + (((tickAnim - 0) / 18) * (32.3442-(-15.6592)));
            zz = -12.4255 + (((tickAnim - 0) / 18) * (3.514-(-12.4255)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.2979 + (((tickAnim - 18) / 7) * (-1.5292-(0.2979)));
            yy = 32.3442 + (((tickAnim - 18) / 7) * (171.5847-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(32.3442)));
            zz = 3.514 + (((tickAnim - 18) / 7) * (17.0874-(3.514)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -1.5292 + (((tickAnim - 25) / 8) * (7.7888-(-1.5292)));
            yy = 171.5847-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 25) / 8) * (-15.6592-(171.5847-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            zz = 17.0874 + (((tickAnim - 25) / 8) * (-12.4255-(17.0874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 9 + (((tickAnim - 0) / 18) * (0-(9)));
            yy = 0 + (((tickAnim - 0) / 18) * (40-(0)));
            zz = 20.25 + (((tickAnim - 0) / 18) * (0-(20.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-19.3782-(0)));
            yy = 40 + (((tickAnim - 18) / 7) * (-52.9434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300-(40)));
            zz = 0 + (((tickAnim - 18) / 7) * (-10.6127-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -19.3782 + (((tickAnim - 25) / 8) * (9-(-19.3782)));
            yy = -52.9434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300 + (((tickAnim - 25) / 8) * (0-(-52.9434-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300)));
            zz = -10.6127 + (((tickAnim - 25) / 8) * (20.25-(-10.6127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0.4-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.4 + (((tickAnim - 25) / 8) * (0-(0.4)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.2447 + (((tickAnim - 0) / 5) * (9.9815-(0.2447)));
            yy = 8.0644 + (((tickAnim - 0) / 5) * (-12.7433-(8.0644)));
            zz = -16.8055 + (((tickAnim - 0) / 5) * (-5.1431-(-16.8055)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 9.9815 + (((tickAnim - 5) / 6) * (20.1754-(9.9815)));
            yy = -12.7433 + (((tickAnim - 5) / 6) * (-35.0552-(-12.7433)));
            zz = -5.1431 + (((tickAnim - 5) / 6) * (2.8731-(-5.1431)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 20.1754 + (((tickAnim - 11) / 7) * (35.25-(20.1754)));
            yy = -35.0552 + (((tickAnim - 11) / 7) * (-19.75-(-35.0552)));
            zz = 2.8731 + (((tickAnim - 11) / 7) * (0-(2.8731)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 35.25 + (((tickAnim - 18) / 7) * (45.1268-(35.25)));
            yy = -19.75 + (((tickAnim - 18) / 7) * (39.6861-(-19.75)));
            zz = 0 + (((tickAnim - 18) / 7) * (-3.521-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 45.1268 + (((tickAnim - 25) / 8) * (0.2447-(45.1268)));
            yy = 39.6861 + (((tickAnim - 25) / 8) * (8.0644-(39.6861)));
            zz = -3.521 + (((tickAnim - 25) / 8) * (-16.8055-(-3.521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 0) / 5) * (0.175-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.175 + (((tickAnim - 5) / 6) * (-0.37-(0.175)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -0.37 + (((tickAnim - 11) / 7) * (0-(-0.37)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0.745-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0.745 + (((tickAnim - 25) / 8) * (-0.05-(0.745)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0.5 + (((tickAnim - 25) / 8) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.2979 + (((tickAnim - 0) / 8) * (-1.5292-(0.2979)));
            yy = -32.3442 + (((tickAnim - 0) / 8) * (-33.3903-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-32.3442)));
            zz = -3.514 + (((tickAnim - 0) / 8) * (-17.0874-(-3.514)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -1.5292 + (((tickAnim - 8) / 9) * (7.7888-(-1.5292)));
            yy = -33.3903-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 8) / 9) * (15.6592-(-33.3903-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = -17.0874 + (((tickAnim - 8) / 9) * (12.4255-(-17.0874)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 7.7888 + (((tickAnim - 17) / 16) * (0.2979-(7.7888)));
            yy = 15.6592 + (((tickAnim - 17) / 16) * (-32.3442-(15.6592)));
            zz = 12.4255 + (((tickAnim - 17) / 16) * (-3.514-(12.4255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.147-(0)));
            yy = -40 + (((tickAnim - 0) / 8) * (-130.4546-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300-(-40)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.6719-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.147 + (((tickAnim - 8) / 9) * (15.5-(-2.147)));
            yy = -130.4546-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300 + (((tickAnim - 8) / 9) * (0-(-130.4546-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300)));
            zz = -0.6719 + (((tickAnim - 8) / 9) * (-20.25-(-0.6719)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 15.5 + (((tickAnim - 17) / 16) * (0-(15.5)));
            yy = 0 + (((tickAnim - 17) / 16) * (-40-(0)));
            zz = -20.25 + (((tickAnim - 17) / 16) * (0-(-20.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.4 + (((tickAnim - 8) / 9) * (0-(-0.4)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 35.25 + (((tickAnim - 0) / 8) * (14.4268-(35.25)));
            yy = 19.75 + (((tickAnim - 0) / 8) * (-39.6861-(19.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (22.529-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 14.4268 + (((tickAnim - 8) / 9) * (-0.0612-(14.4268)));
            yy = -39.6861 + (((tickAnim - 8) / 9) * (-5.3865-(-39.6861)));
            zz = 22.529 + (((tickAnim - 8) / 9) * (19.08-(22.529)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.0612 + (((tickAnim - 17) / 5) * (9.9815-(-0.0612)));
            yy = -5.3865 + (((tickAnim - 17) / 5) * (12.7433-(-5.3865)));
            zz = 19.08 + (((tickAnim - 17) / 5) * (5.1431-(19.08)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 9.9815 + (((tickAnim - 22) / 6) * (20.1754-(9.9815)));
            yy = 12.7433 + (((tickAnim - 22) / 6) * (35.0552-(12.7433)));
            zz = 5.1431 + (((tickAnim - 22) / 6) * (-2.8731-(5.1431)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 20.1754 + (((tickAnim - 28) / 5) * (35.25-(20.1754)));
            yy = 35.0552 + (((tickAnim - 28) / 5) * (19.75-(35.0552)));
            zz = -2.8731 + (((tickAnim - 28) / 5) * (0-(-2.8731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.745-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.745 + (((tickAnim - 8) / 9) * (-0.05-(-0.745)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0.5 + (((tickAnim - 8) / 9) * (0-(0.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.05 + (((tickAnim - 17) / 5) * (-0.175-(-0.05)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -0.175 + (((tickAnim - 22) / 6) * (0.37-(-0.175)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0.37 + (((tickAnim - 28) / 5) * (0-(0.37)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+70))*0.5), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+70))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+70))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+50))*-1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-20))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+50))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-80))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+100))*1.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-50))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+100))*1.5), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-100))*5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+100))*2.5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 31.3724 + (((tickAnim - 0) / 8) * (50.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(31.3724)));
            yy = 32.936 + (((tickAnim - 0) / 8) * (57.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(32.936)));
            zz = -36.7933 + (((tickAnim - 0) / 8) * (-31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-36.7933)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 50.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 8) / 9) * (0-(50.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 57.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 8) / 9) * (-60.75-(57.282-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            zz = -31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 8) / 9) * (0-(-31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (31.3724-(0)));
            yy = -60.75 + (((tickAnim - 17) / 16) * (32.936-(-60.75)));
            zz = 0 + (((tickAnim - 17) / 16) * (-36.7933-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15.75 + (((tickAnim - 0) / 8) * (-8.058-(15.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (4.6478-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (34.1363-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -8.058 + (((tickAnim - 8) / 9) * (6.5669-(-8.058)));
            yy = 4.6478 + (((tickAnim - 8) / 9) * (35.6603-(4.6478)));
            zz = 34.1363 + (((tickAnim - 8) / 9) * (24.7024-(34.1363)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 6.5669 + (((tickAnim - 17) / 16) * (15.75-(6.5669)));
            yy = 35.6603 + (((tickAnim - 17) / 16) * (0-(35.6603)));
            zz = 24.7024 + (((tickAnim - 17) / 16) * (0-(24.7024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.325-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 17) / 16) * (0-(0)));
            yy = 0.075 + (((tickAnim - 17) / 16) * (0-(0.075)));
            zz = 0.325 + (((tickAnim - 17) / 16) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -19.1055 + (((tickAnim - 0) / 4) * (-6.062-(-19.1055)));
            yy = 61.8673 + (((tickAnim - 0) / 4) * (69.6599-(61.8673)));
            zz = -20.5623 + (((tickAnim - 0) / 4) * (-31.8095-(-20.5623)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.062 + (((tickAnim - 4) / 4) * (0.4314-(-6.062)));
            yy = 69.6599 + (((tickAnim - 4) / 4) * (69.2765-(69.6599)));
            zz = -31.8095 + (((tickAnim - 4) / 4) * (-9.9127-(-31.8095)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0.4314 + (((tickAnim - 8) / 9) * (1.7311-(0.4314)));
            yy = 69.2765 + (((tickAnim - 8) / 9) * (12.8859-(69.2765)));
            zz = -9.9127 + (((tickAnim - 8) / 9) * (5.7307-(-9.9127)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 1.7311 + (((tickAnim - 17) / 2) * (-2.1283-(1.7311)));
            yy = 12.8859 + (((tickAnim - 17) / 2) * (12.8444-(12.8859)));
            zz = 5.7307 + (((tickAnim - 17) / 2) * (-2.945-(5.7307)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -2.1283 + (((tickAnim - 19) / 8) * (-10.7691-(-2.1283)));
            yy = 12.8444 + (((tickAnim - 19) / 8) * (3.2204-(12.8444)));
            zz = -2.945 + (((tickAnim - 19) / 8) * (-1.2086-(-2.945)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -10.7691 + (((tickAnim - 27) / 6) * (-19.1055-(-10.7691)));
            yy = 3.2204 + (((tickAnim - 27) / 6) * (61.8673-(3.2204)));
            zz = -1.2086 + (((tickAnim - 27) / 6) * (-20.5623-(-1.2086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.85-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -0.85 + (((tickAnim - 8) / 9) * (0-(-0.85)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0.075-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            zz = 0.075 + (((tickAnim - 19) / 14) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (31.3724-(0)));
            yy = 60.75 + (((tickAnim - 0) / 18) * (-32.936-(60.75)));
            zz = 0 + (((tickAnim - 0) / 18) * (36.7933-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 31.3724 + (((tickAnim - 18) / 7) * (262.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(31.3724)));
            yy = -32.936 + (((tickAnim - 18) / 7) * (-162.793-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-32.936)));
            zz = 36.7933 + (((tickAnim - 18) / 7) * (18.3967-(36.7933)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 262.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 25) / 8) * (0-(262.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -162.793-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 25) / 8) * (60.75-(-162.793-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 18.3967 + (((tickAnim - 25) / 8) * (0-(18.3967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 6.5669 + (((tickAnim - 0) / 6) * (9.1741-(6.5669)));
            yy = -35.6603 + (((tickAnim - 0) / 6) * (-26.7812-(-35.6603)));
            zz = -24.7024 + (((tickAnim - 0) / 6) * (-9.3783-(-24.7024)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 9.1741 + (((tickAnim - 6) / 12) * (15.75-(9.1741)));
            yy = -26.7812 + (((tickAnim - 6) / 12) * (0-(-26.7812)));
            zz = -9.3783 + (((tickAnim - 6) / 12) * (0-(-9.3783)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 15.75 + (((tickAnim - 18) / 7) * (-9.5964-(15.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (-6.4585-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-28.2891-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -9.5964 + (((tickAnim - 25) / 8) * (6.5669-(-9.5964)));
            yy = -6.4585 + (((tickAnim - 25) / 8) * (-35.6603-(-6.4585)));
            zz = -28.2891 + (((tickAnim - 25) / 8) * (-24.7024-(-28.2891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 18) * (0-(0.075)));
            zz = 0.325 + (((tickAnim - 0) / 18) * (0-(0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0.075-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.7311 + (((tickAnim - 0) / 3) * (-1.9501-(1.7311)));
            yy = -12.8859 + (((tickAnim - 0) / 3) * (-9.1462-(-12.8859)));
            zz = -5.7307 + (((tickAnim - 0) / 3) * (2.2988-(-5.7307)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -1.9501 + (((tickAnim - 3) / 7) * (-10.7691-(-1.9501)));
            yy = -9.1462 + (((tickAnim - 3) / 7) * (-3.2204-(-9.1462)));
            zz = 2.2988 + (((tickAnim - 3) / 7) * (1.2086-(2.2988)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10.7691 + (((tickAnim - 10) / 8) * (-32.075-(-10.7691)));
            yy = -3.2204 + (((tickAnim - 10) / 8) * (-64.25-(-3.2204)));
            zz = 1.2086 + (((tickAnim - 10) / 8) * (32.075-(1.2086)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -32.075 + (((tickAnim - 18) / 3) * (-44.5395-(-32.075)));
            yy = -64.25 + (((tickAnim - 18) / 3) * (-75.2576-(-64.25)));
            zz = 32.075 + (((tickAnim - 18) / 3) * (45.3378-(32.075)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -44.5395 + (((tickAnim - 21) / 4) * (-10.4936-(-44.5395)));
            yy = -75.2576 + (((tickAnim - 21) / 4) * (-69.2765-(-75.2576)));
            zz = 45.3378 + (((tickAnim - 21) / 4) * (9.9127-(45.3378)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -10.4936 + (((tickAnim - 25) / 8) * (1.7311-(-10.4936)));
            yy = -69.2765 + (((tickAnim - 25) / 8) * (-12.8859-(-69.2765)));
            zz = 9.9127 + (((tickAnim - 25) / 8) * (-5.7307-(9.9127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 15) * (0-(0)));
            zz = 0.075 + (((tickAnim - 3) / 15) * (0-(0.075)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.975-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = -0.975 + (((tickAnim - 25) / 8) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+40))*-1.5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222-70))*-7), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+40))*1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222/0.5+40))*-0.59), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*222+40))*2));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075 + (((tickAnim - 2) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075 + (((tickAnim - 18) / 1) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPholidosaurus entity = (EntityPrehistoricFloraPholidosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*-1), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*10), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*-5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5))*0.39);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7.7888 + (((tickAnim - 0) / 7) * (0.6855-(7.7888)));
            yy = -15.6592 + (((tickAnim - 0) / 7) * (52.5675-(-15.6592)));
            zz = -12.4255 + (((tickAnim - 0) / 7) * (4.6322-(-12.4255)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.6855 + (((tickAnim - 7) / 3) * (-1.5292-(0.6855)));
            yy = 52.5675 + (((tickAnim - 7) / 3) * (98.3097-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(52.5675)));
            zz = 4.6322 + (((tickAnim - 7) / 3) * (29.9624-(4.6322)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.5292 + (((tickAnim - 10) / 3) * (7.7888-(-1.5292)));
            yy = 98.3097-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 10) / 3) * (-15.6592-(98.3097-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            zz = 29.9624 + (((tickAnim - 10) / 3) * (-12.4255-(29.9624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 9 + (((tickAnim - 0) / 7) * (0-(9)));
            yy = 0 + (((tickAnim - 0) / 7) * (40-(0)));
            zz = 20.25 + (((tickAnim - 0) / 7) * (0-(20.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-19.3782-(0)));
            yy = 40 + (((tickAnim - 7) / 3) * (-205.7184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300-(40)));
            zz = 0 + (((tickAnim - 7) / 3) * (-10.6127-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -19.3782 + (((tickAnim - 10) / 3) * (9-(-19.3782)));
            yy = -205.7184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300 + (((tickAnim - 10) / 3) * (0-(-205.7184-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*300)));
            zz = -10.6127 + (((tickAnim - 10) / 3) * (20.25-(-10.6127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0.4-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.4 + (((tickAnim - 10) / 3) * (0-(0.4)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
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
            xx = 0.2447 + (((tickAnim - 0) / 2) * (9.9815-(0.2447)));
            yy = 8.0644 + (((tickAnim - 0) / 2) * (-12.7433-(8.0644)));
            zz = -16.8055 + (((tickAnim - 0) / 2) * (-5.1431-(-16.8055)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 9.9815 + (((tickAnim - 2) / 2) * (20.1754-(9.9815)));
            yy = -12.7433 + (((tickAnim - 2) / 2) * (-35.0552-(-12.7433)));
            zz = -5.1431 + (((tickAnim - 2) / 2) * (2.8731-(-5.1431)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 20.1754 + (((tickAnim - 4) / 3) * (35.25-(20.1754)));
            yy = -35.0552 + (((tickAnim - 4) / 3) * (-19.75-(-35.0552)));
            zz = 2.8731 + (((tickAnim - 4) / 3) * (0-(2.8731)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 35.25 + (((tickAnim - 7) / 2) * (45.1268-(35.25)));
            yy = -19.75 + (((tickAnim - 7) / 2) * (39.6861-(-19.75)));
            zz = 0 + (((tickAnim - 7) / 2) * (-3.521-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 45.1268 + (((tickAnim - 9) / 2) * (11.2496-(45.1268)));
            yy = 39.6861 + (((tickAnim - 9) / 2) * (4.4317-(39.6861)));
            zz = -3.521 + (((tickAnim - 9) / 2) * (-4.8447-(-3.521)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 11.2496 + (((tickAnim - 11) / 2) * (0.2447-(11.2496)));
            yy = 4.4317 + (((tickAnim - 11) / 2) * (8.0644-(4.4317)));
            zz = -4.8447 + (((tickAnim - 11) / 2) * (-16.8055-(-4.8447)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.05 + (((tickAnim - 0) / 2) * (0.175-(-0.05)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.175 + (((tickAnim - 2) / 2) * (-0.37-(0.175)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.37 + (((tickAnim - 4) / 3) * (0-(-0.37)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0.745-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.745 + (((tickAnim - 9) / 2) * (0.875-(0.745)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 9) / 2) * (0.25-(0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.875 + (((tickAnim - 11) / 2) * (-0.05-(0.875)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 11) / 2) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.5079 + (((tickAnim - 0) / 3) * (-2.496-(0.5079)));
            yy = -46.0769 + (((tickAnim - 0) / 3) * (-33.2618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-46.0769)));
            zz = -4.2392 + (((tickAnim - 0) / 3) * (-32.1178-(-4.2392)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.496 + (((tickAnim - 3) / 4) * (7.7888-(-2.496)));
            yy = -33.2618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 3) / 4) * (15.6592-(-33.2618-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = -32.1178 + (((tickAnim - 3) / 4) * (12.4255-(-32.1178)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 7.7888 + (((tickAnim - 7) / 6) * (0.5079-(7.7888)));
            yy = 15.6592 + (((tickAnim - 7) / 6) * (-46.0769-(15.6592)));
            zz = 12.4255 + (((tickAnim - 7) / 6) * (-4.2392-(12.4255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.147-(0)));
            yy = -40 + (((tickAnim - 0) / 3) * (-80.6046-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300-(-40)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6719-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.147 + (((tickAnim - 3) / 4) * (15.5-(-2.147)));
            yy = -80.6046-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300 + (((tickAnim - 3) / 4) * (0-(-80.6046-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-300)));
            zz = -0.6719 + (((tickAnim - 3) / 4) * (-20.25-(-0.6719)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 15.5 + (((tickAnim - 7) / 6) * (0-(15.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (-40-(0)));
            zz = -20.25 + (((tickAnim - 7) / 6) * (0-(-20.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.4 + (((tickAnim - 3) / 4) * (0-(-0.4)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.25 + (((tickAnim - 0) / 3) * (14.4268-(35.25)));
            yy = 19.75 + (((tickAnim - 0) / 3) * (-39.6861-(19.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (22.529-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14.4268 + (((tickAnim - 3) / 2) * (11.2496-(14.4268)));
            yy = -39.6861 + (((tickAnim - 3) / 2) * (-4.4317-(-39.6861)));
            zz = 22.529 + (((tickAnim - 3) / 2) * (4.8447-(22.529)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 11.2496 + (((tickAnim - 5) / 2) * (-0.0612-(11.2496)));
            yy = -4.4317 + (((tickAnim - 5) / 2) * (-5.3865-(-4.4317)));
            zz = 4.8447 + (((tickAnim - 5) / 2) * (19.08-(4.8447)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.0612 + (((tickAnim - 7) / 1) * (9.9815-(-0.0612)));
            yy = -5.3865 + (((tickAnim - 7) / 1) * (12.7433-(-5.3865)));
            zz = 19.08 + (((tickAnim - 7) / 1) * (5.1431-(19.08)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 9.9815 + (((tickAnim - 8) / 3) * (20.1754-(9.9815)));
            yy = 12.7433 + (((tickAnim - 8) / 3) * (35.0552-(12.7433)));
            zz = 5.1431 + (((tickAnim - 8) / 3) * (-2.8731-(5.1431)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 20.1754 + (((tickAnim - 11) / 2) * (35.25-(20.1754)));
            yy = 35.0552 + (((tickAnim - 11) / 2) * (19.75-(35.0552)));
            zz = -2.8731 + (((tickAnim - 11) / 2) * (0-(-2.8731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.745-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.745 + (((tickAnim - 3) / 2) * (-0.875-(-0.745)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.25-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.875 + (((tickAnim - 5) / 2) * (-0.05-(-0.875)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0.25 + (((tickAnim - 5) / 2) * (0-(0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.05 + (((tickAnim - 7) / 1) * (-0.175-(-0.05)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.175 + (((tickAnim - 8) / 3) * (0.37-(-0.175)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.37 + (((tickAnim - 11) / 2) * (0-(0.37)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+70))*0.5), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+70))*5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+70))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+50))*-1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-20))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+50))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-80))*25), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*1.5), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+100))*2.5), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*5.5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.3724 + (((tickAnim - 0) / 3) * (70.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(31.3724)));
            yy = 32.936 + (((tickAnim - 0) / 3) * (20.607-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(32.936)));
            zz = -36.7933 + (((tickAnim - 0) / 3) * (-31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-36.7933)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 70.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 4) * (0-(70.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 20.607-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 3) / 4) * (-65.5-(20.607-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            zz = -31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 3) / 4) * (0-(-31.7283+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (31.3724-(0)));
            yy = -65.5 + (((tickAnim - 7) / 6) * (32.936-(-65.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (-36.7933-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.75 + (((tickAnim - 0) / 3) * (-8.058-(15.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.6478-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (34.1363-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -8.058 + (((tickAnim - 3) / 4) * (6.5669-(-8.058)));
            yy = 4.6478 + (((tickAnim - 3) / 4) * (35.6603-(4.6478)));
            zz = 34.1363 + (((tickAnim - 3) / 4) * (24.7024-(34.1363)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 6.5669 + (((tickAnim - 7) / 6) * (15.75-(6.5669)));
            yy = 35.6603 + (((tickAnim - 7) / 6) * (0-(35.6603)));
            zz = 24.7024 + (((tickAnim - 7) / 6) * (0-(24.7024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.325-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.075 + (((tickAnim - 7) / 6) * (0-(0.075)));
            zz = 0.325 + (((tickAnim - 7) / 6) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -19.1055 + (((tickAnim - 0) / 2) * (-6.062-(-19.1055)));
            yy = 61.8673 + (((tickAnim - 0) / 2) * (69.6599-(61.8673)));
            zz = -20.5623 + (((tickAnim - 0) / 2) * (-31.8095-(-20.5623)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.062 + (((tickAnim - 2) / 1) * (0.4314-(-6.062)));
            yy = 69.6599 + (((tickAnim - 2) / 1) * (69.2765-(69.6599)));
            zz = -31.8095 + (((tickAnim - 2) / 1) * (-9.9127-(-31.8095)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.4314 + (((tickAnim - 3) / 4) * (1.7311-(0.4314)));
            yy = 69.2765 + (((tickAnim - 3) / 4) * (12.8859-(69.2765)));
            zz = -9.9127 + (((tickAnim - 3) / 4) * (5.7307-(-9.9127)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1.7311 + (((tickAnim - 7) / 1) * (-2.1283-(1.7311)));
            yy = 12.8859 + (((tickAnim - 7) / 1) * (12.8444-(12.8859)));
            zz = 5.7307 + (((tickAnim - 7) / 1) * (-2.945-(5.7307)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.1283 + (((tickAnim - 8) / 2) * (-10.7691-(-2.1283)));
            yy = 12.8444 + (((tickAnim - 8) / 2) * (3.2204-(12.8444)));
            zz = -2.945 + (((tickAnim - 8) / 2) * (-1.2086-(-2.945)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.7691 + (((tickAnim - 10) / 3) * (-19.1055-(-10.7691)));
            yy = 3.2204 + (((tickAnim - 10) / 3) * (61.8673-(3.2204)));
            zz = -1.2086 + (((tickAnim - 10) / 3) * (-20.5623-(-1.2086)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.85-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -0.85 + (((tickAnim - 3) / 4) * (0-(-0.85)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0.075 + (((tickAnim - 8) / 5) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (31.3724-(0)));
            yy = 69.5 + (((tickAnim - 0) / 7) * (-32.936-(69.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (36.7933-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 31.3724 + (((tickAnim - 7) / 3) * (170.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300-(31.3724)));
            yy = -32.936 + (((tickAnim - 7) / 3) * (-67.768-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-32.936)));
            zz = 36.7933 + (((tickAnim - 7) / 3) * (18.3967-(36.7933)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 170.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300 + (((tickAnim - 10) / 3) * (0-(170.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*300)));
            yy = -67.768-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 10) / 3) * (69.5-(-67.768-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 18.3967 + (((tickAnim - 10) / 3) * (0-(18.3967)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.5669 + (((tickAnim - 0) / 3) * (9.1741-(6.5669)));
            yy = -35.6603 + (((tickAnim - 0) / 3) * (-26.7812-(-35.6603)));
            zz = -24.7024 + (((tickAnim - 0) / 3) * (-9.3783-(-24.7024)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.1741 + (((tickAnim - 3) / 4) * (15.75-(9.1741)));
            yy = -26.7812 + (((tickAnim - 3) / 4) * (0-(-26.7812)));
            zz = -9.3783 + (((tickAnim - 3) / 4) * (0-(-9.3783)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 15.75 + (((tickAnim - 7) / 3) * (-9.5964-(15.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (-6.4585-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-28.2891-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.5964 + (((tickAnim - 10) / 3) * (6.5669-(-9.5964)));
            yy = -6.4585 + (((tickAnim - 10) / 3) * (-35.6603-(-6.4585)));
            zz = -28.2891 + (((tickAnim - 10) / 3) * (-24.7024-(-28.2891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 7) * (0-(0.075)));
            zz = 0.325 + (((tickAnim - 0) / 7) * (0-(0.325)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0.075-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.325-(0)));
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
            xx = 1.7311 + (((tickAnim - 0) / 1) * (-1.9501-(1.7311)));
            yy = -12.8859 + (((tickAnim - 0) / 1) * (-9.1462-(-12.8859)));
            zz = -5.7307 + (((tickAnim - 0) / 1) * (2.2988-(-5.7307)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -1.9501 + (((tickAnim - 1) / 3) * (-10.7691-(-1.9501)));
            yy = -9.1462 + (((tickAnim - 1) / 3) * (-3.2204-(-9.1462)));
            zz = 2.2988 + (((tickAnim - 1) / 3) * (1.2086-(2.2988)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -10.7691 + (((tickAnim - 4) / 3) * (-32.075-(-10.7691)));
            yy = -3.2204 + (((tickAnim - 4) / 3) * (-64.25-(-3.2204)));
            zz = 1.2086 + (((tickAnim - 4) / 3) * (32.075-(1.2086)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -32.075 + (((tickAnim - 7) / 1) * (-44.5395-(-32.075)));
            yy = -64.25 + (((tickAnim - 7) / 1) * (-75.2576-(-64.25)));
            zz = 32.075 + (((tickAnim - 7) / 1) * (45.3378-(32.075)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -44.5395 + (((tickAnim - 8) / 2) * (-10.4936-(-44.5395)));
            yy = -75.2576 + (((tickAnim - 8) / 2) * (-69.2765-(-75.2576)));
            zz = 45.3378 + (((tickAnim - 8) / 2) * (9.9127-(45.3378)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.4936 + (((tickAnim - 10) / 3) * (1.7311-(-10.4936)));
            yy = -69.2765 + (((tickAnim - 10) / 3) * (-12.8859-(-69.2765)));
            zz = 9.9127 + (((tickAnim - 10) / 3) * (-5.7307-(9.9127)));
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
            zz = 0 + (((tickAnim - 0) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            zz = 0.075 + (((tickAnim - 1) / 6) * (0-(0.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.975-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -0.975 + (((tickAnim - 10) / 3) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+40))*-2.5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-70))*-13), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+40))*2.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2.85-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+40))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+40))*-2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+40))*2));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075 + (((tickAnim - 1) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075 + (((tickAnim - 7) / 1) * (0-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-0.075)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPholidosaurus e = (EntityPrehistoricFloraPholidosaurus) entity;
        animator.update(entity);


    }
}
