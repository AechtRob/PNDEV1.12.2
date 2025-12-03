package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChalawan;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelChalawan extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backleftleg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;

    public ModelChalawan() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.0F, 12.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 98, -4.0F, -3.0F, -1.0F, 8, 1, 8, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 90, 41, -4.0F, -2.5F, -1.0F, 8, 1, 8, 0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 63, -5.0F, -2.0F, -1.0F, 10, 10, 8, 0.0F, false));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-4.5F, 1.2F, 3.6F);
        this.hips.addChild(backrightleg);
        this.setRotateAngle(backrightleg, -0.7416F, 1.1733F, 0.2408F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 92, 98, -2.6222F, -2.342F, -1.5023F, 7, 9, 6, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(1.1278F, 5.408F, 1.4977F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 1.0463F, -0.4074F, -0.813F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 110, 50, -2.5F, -1.0F, -2.25F, 5, 8, 5, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, 0.0436F, 0.0F, -0.0087F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 118, 98, -3.5F, 0.0F, -3.5F, 7, 2, 5, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.backrightleg3.addChild(backrightleg4);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 122, 43, -3.5F, -1.0F, -3.5F, 7, 2, 4, -0.01F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(4.5F, 1.2F, 3.6F);
        this.hips.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.7416F, -1.1733F, -0.2408F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 92, 98, -4.3778F, -2.342F, -1.5023F, 7, 9, 6, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(-1.1278F, 5.408F, 1.4977F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 1.0463F, 0.4074F, 0.813F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 110, 50, -2.5F, -1.0F, -2.25F, 5, 8, 5, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 6.5F, 0.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0436F, 0.0F, 0.0087F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 118, 98, -3.5F, 0.0F, -3.5F, 7, 2, 5, 0.0F, true));

        this.backleftleg4 = new AdvancedModelRenderer(this);
        this.backleftleg4.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.backleftleg3.addChild(backleftleg4);
        this.backleftleg4.cubeList.add(new ModelBox(backleftleg4, 122, 43, -3.5F, -1.0F, -3.5F, 7, 2, 4, -0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.3F, -5.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 90, -5.0F, -3.0F, -1.0F, 10, 1, 7, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 17, -5.0F, -2.5F, -1.0F, 10, 1, 7, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 45, -6.0F, -2.0F, -1.0F, 12, 11, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.75F, -5.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.0F, -2.65F, -11.5F, 14, 12, 12, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 42, 25, -5.5F, -3.25F, -11.5F, 11, 1, 12, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 42, 38, -5.5F, -3.75F, -11.5F, 11, 1, 12, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.15F, -11.4F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 25, -6.0F, -2.4F, -7.6F, 12, 11, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 8.2F, -5.2F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 89, -5.0F, -11.5F, -2.0F, 10, 1, 8, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 62, -5.0F, -11.0F, -2.0F, 10, 1, 8, 0.01F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(5.5F, 6.25F, -5.0F);
        this.body3.addChild(frontleftleg);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.95F, 0.75F, 0.45F);
        this.frontleftleg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2443F, 0.9643F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 117, -2.0F, -2.0F, -1.0F, 5, 4, 6, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(2.825F, 1.825F, 3.075F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -1.7823F, 0.181F, -0.0514F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 24, 122, -2.0F, -1.25F, -0.5F, 4, 3, 6, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.1744F, 0.0007F, -0.1821F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 122, 123, -3.0F, -1.25F, -0.5F, 6, 5, 2, 0.0F, true));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-5.5F, 6.25F, -5.0F);
        this.body3.addChild(frontrightleg);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.95F, 0.75F, 0.45F);
        this.frontrightleg.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2443F, -0.9643F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 117, -3.0F, -2.0F, -1.0F, 5, 4, 6, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-2.825F, 1.825F, 3.075F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -1.7823F, -0.181F, 0.0514F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 24, 122, -2.0F, -1.25F, -0.5F, 4, 3, 6, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.1744F, -0.0007F, 0.1821F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 122, 123, -3.0F, -1.25F, -0.5F, 6, 5, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.6F, -7.6F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 52, 0, -5.5F, -2.0F, -7.0F, 11, 8, 9, 0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.7F, -5.6F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 99, -4.0F, -5.5F, -1.0F, 8, 1, 7, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 74, 51, -4.0F, -5.0F, -1.0F, 8, 2, 9, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.65F, -7.2F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 81, -4.0F, -2.0F, 0.0F, 8, 2, 9, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.25F, -7.35F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 122, 37, -3.0F, 0.975F, -7.65F, 6, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 68, 128, -2.0F, 0.975F, -10.65F, 4, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 106, 85, -5.5F, -1.025F, -3.0F, 11, 3, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 68, 107, -1.5F, 1.0F, -19.65F, 3, 1, 9, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 44, 107, -1.5F, 0.4F, -19.65F, 3, 1, 9, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 0.25F, -19.65F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 90, 50, -2.0F, 1.75F, -2.0F, 3, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 45, 1.5F, 1.75F, -1.75F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 45, -2.5F, 1.75F, -1.75F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 130, 53, -2.5F, 0.0F, -2.0F, 4, 2, 2, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 2.0F, -15.65F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 126, 75, 0.0F, -0.45F, -4.25F, 0, 1, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.55F, 2.0F, -11.65F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.048F, 0.2269F, -0.2443F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 117, 0.525F, -0.375F, -2.25F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.95F, 2.075F, -9.8F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.624F, -0.5149F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 45, 0.575F, -0.3F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.6F, 2.0F, -11.65F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2356F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 128, -0.5F, -1.0F, -3.0F, 1, 1, 5, 0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.1F, 2.0F, -9.8F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 57, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.4F, 0.0F, -7.8F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2356F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 120, 28, -3.5F, 0.0F, -1.0F, 4, 2, 7, 0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, -19.9F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 130, 60, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 2.0F, -15.65F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 126, 75, 0.0F, -0.45F, -4.25F, 0, 1, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.1F, -9.675F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 126, 82, -2.0F, 0.075F, -2.0F, 4, 1, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.0F, -8.475F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.576F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 125, -2.0F, 0.075F, -2.0F, 5, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.55F, 2.0F, -11.65F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.048F, -0.2269F, 0.2443F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 86, 117, -0.525F, -0.375F, -2.25F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.6F, 2.0F, -11.65F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2356F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 128, -0.5F, -1.0F, -3.0F, 1, 1, 5, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.95F, 2.075F, -9.8F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2618F, -0.624F, 0.5149F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 45, -0.575F, -0.3F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.1F, 2.0F, -9.8F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.672F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 130, 57, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.125F, -2.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 110, 63, -4.5F, -2.0F, -1.0F, 9, 2, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-3.4F, 0.0F, -7.8F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2356F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 120, 28, -0.5F, 0.0F, -1.0F, 4, 2, 7, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.475F, -7.45F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0698F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 122, 20, -2.5F, -1.975F, 0.0F, 6, 2, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 0.55F, -3.65F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 114, 113, -2.5F, -1.575F, -4.1F, 6, 5, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 106, 92, -5.0F, 1.425F, 0.65F, 11, 2, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 130, -1.5F, 1.425F, -7.0F, 4, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 86, 123, 0.0F, 1.45F, -14.5F, 1, 1, 8, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 104, 123, -0.75F, 1.45F, -14.5F, 1, 1, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 130, -1.0F, 1.45F, -16.5F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 96, -1.0F, 0.95F, -16.475F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 127, -0.725F, 0.95F, -16.5F, 0, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 127, 1.725F, 0.95F, -16.5F, 0, 1, 6, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 104, 123, 0.75F, 1.45F, -14.5F, 1, 1, 8, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.45F, -16.0F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0785F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 49, -1.5F, -1.0F, 8.9F, 4, 1, 3, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 92, 113, -0.5F, -1.0F, 0.0F, 2, 1, 9, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.9F, 0.45F, -4.15F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.2356F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 122, 11, -3.5F, 1.0F, -1.0F, 4, 2, 7, 0.01F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.5F, 2.45F, -6.15F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.672F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 122, 130, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.1F, 1.95F, -8.0F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.2356F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 125, 0.325F, -1.0F, -2.5F, 0, 1, 4, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 126, 69, -1.6F, -0.5F, -3.0F, 2, 1, 5, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(2.0F, 1.45F, -15.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.1745F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 27, 132, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0F, 1.45F, -15.0F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.1745F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 27, 132, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.1F, 1.95F, -8.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.2356F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 125, -0.325F, -1.0F, -2.5F, 0, 1, 4, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 126, 69, -0.4F, -0.5F, -3.0F, 2, 1, 5, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, 2.45F, -6.15F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.672F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 122, 130, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-2.9F, 0.45F, -4.15F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.2356F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 122, 11, -0.5F, 1.0F, -1.0F, 4, 2, 7, 0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 3.325F, -5.1F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.3752F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 118, 105, -3.0F, -2.0F, 0.0F, 6, 2, 5, 0.0F, false));
        this.throat.cubeList.add(new ModelBox(throat, 33, 137, -3.0F, -3.75F, 0.0F, 6, 2, 5, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.throat.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 136, -3.5F, -4.85F, 0.0F, 7, 3, 5, -0.01F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 117, -3.5F, -3.0F, 0.0F, 7, 3, 5, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-2.25F, -0.7F, -7.45F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0873F, -0.2618F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.eyeright.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1309F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 92, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(2.25F, -0.7F, -7.45F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0873F, 0.2618F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.eyeleft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 92, 0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.95F, 7.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 38, 51, -3.5F, -2.5F, -1.0F, 7, 9, 11, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 90, 16, -2.5F, -3.25F, -1.0F, 5, 1, 11, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0262F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 71, -3.0F, -2.5F, -1.0F, 6, 8, 11, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 90, 28, -2.0F, -4.5F, -1.0F, 4, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.45F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1047F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 70, 71, -2.5F, -3.25F, -1.0F, 5, 7, 11, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 92, -1.5F, -5.25F, -1.0F, 3, 2, 11, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.1F, 10.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 92, 0, -2.0F, -2.5F, -1.0F, 4, 6, 10, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 105, -1.0F, -4.5F, -1.0F, 2, 2, 10, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.8F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 102, 71, -1.5F, -2.5F, -1.0F, 3, 5, 9, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 120, 0, -0.5F, -4.5F, -1.0F, 1, 2, 9, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1F, 8.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0175F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 66, 117, -1.0F, -0.75F, -1.0F, 2, 3, 8, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 24, 107, 0.0F, -2.75F, 0.0F, 0, 5, 10, 0.0F, false));

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
        this.hips.offsetY = 0.0F;
        this.hips.offsetX = -0F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.27F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        EntityPrehistoricFloraChalawan entityGoniopholis = (EntityPrehistoricFloraChalawan) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        entityGoniopholis.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityGoniopholis.getAnimation() == entityGoniopholis.LAY_ANIMATION || entityGoniopholis.getAnimation() == entityGoniopholis.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entityGoniopholis.isReallyInWater()) {

                if (f3 == 0.0F || !entityGoniopholis.getIsMoving()) {
                    if (entityGoniopholis.getAnimation() != entityGoniopholis.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityGoniopholis.getIsFast()) { //Running


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
        this.eyeright.setScale(1,1,1);
        this.eyeleft.setScale(1,1,1);

        EntityPrehistoricFloraChalawan ee = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getIsFast());
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
            animCall(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (6.25-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-27.09589-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.09589 + (((tickAnim - 8) / 5) * (0-(-27.09589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (31-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isFast) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim;
        if (isFast) {
           tickAnim = ((entity.ticksExisted * 2) + entity.getTickOffset()) - (int) (Math.floor((double) ((entity.ticksExisted * 2) + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + (partialTickTime * 2);
        }
        else {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*0.25);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5))*-0.5);

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.11072 + (((tickAnim - 0) / 5) * (-18.33244-(-1.11072)));
            yy = -26.20622 + (((tickAnim - 0) / 5) * (-30.01893-(-26.20622)));
            zz = 14.19225 + (((tickAnim - 0) / 5) * (-18.56769-(14.19225)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = -18.33244 + (((tickAnim - 5) / 38) * (50.47961-(-18.33244)));
            yy = -30.01893 + (((tickAnim - 5) / 38) * (-25.77906-(-30.01893)));
            zz = -18.56769 + (((tickAnim - 5) / 38) * (48.21692-(-18.56769)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 50.47961 + (((tickAnim - 43) / 17) * (-1.11072-(50.47961)));
            yy = -25.77906 + (((tickAnim - 43) / 17) * (-26.20622-(-25.77906)));
            zz = 48.21692 + (((tickAnim - 43) / 17) * (14.19225-(48.21692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -16.43351 + (((tickAnim - 0) / 5) * (-20.70234-(-16.43351)));
            yy = 3.68864 + (((tickAnim - 0) / 5) * (2.95049-(3.68864)));
            zz = 8.14936 + (((tickAnim - 0) / 5) * (26.74165-(8.14936)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = -20.70234 + (((tickAnim - 5) / 38) * (22.25-(-20.70234)));
            yy = 2.95049 + (((tickAnim - 5) / 38) * (0-(2.95049)));
            zz = 26.74165 + (((tickAnim - 5) / 38) * (0-(26.74165)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.25 + (((tickAnim - 43) / 7) * (32.1812-(22.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (4.9189-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (22.83778-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 32.1812 + (((tickAnim - 50) / 10) * (-16.43351-(32.1812)));
            yy = 4.9189 + (((tickAnim - 50) / 10) * (3.68864-(4.9189)));
            zz = 22.83778 + (((tickAnim - 50) / 10) * (8.14936-(22.83778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 5) * (-0.625-(0.025)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.45-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 5) / 38) * (0-(0)));
            yy = -0.625 + (((tickAnim - 5) / 38) * (0-(-0.625)));
            zz = 0.45 + (((tickAnim - 5) / 38) * (0-(0.45)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0.35-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (-1.14-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 50) / 4) * (1.01-(0.35)));
            zz = -1.14 + (((tickAnim - 50) / 4) * (-0.91-(-1.14)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 1.01 + (((tickAnim - 54) / 6) * (0.025-(1.01)));
            zz = -0.91 + (((tickAnim - 54) / 6) * (0-(-0.91)));
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
            xx = 1 + (((tickAnim - 0) / 5) * (20.22814-(1)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.97397-(0)));
            zz = -13.25 + (((tickAnim - 0) / 5) * (-2.57187-(-13.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = 20.22814 + (((tickAnim - 5) / 19) * (-21.2406-(20.22814)));
            yy = 0.97397 + (((tickAnim - 5) / 19) * (-2.34085-(0.97397)));
            zz = -2.57187 + (((tickAnim - 5) / 19) * (-11.52864-(-2.57187)));
        }
        else if (tickAnim >= 24 && tickAnim < 43) {
            xx = -21.2406 + (((tickAnim - 24) / 19) * (33.58529-(-21.2406)));
            yy = -2.34085 + (((tickAnim - 24) / 19) * (-15.68049-(-2.34085)));
            zz = -11.52864 + (((tickAnim - 24) / 19) * (-7.86944-(-11.52864)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 33.58529 + (((tickAnim - 43) / 5) * (66.8474-(33.58529)));
            yy = -15.68049 + (((tickAnim - 43) / 5) * (-2.56791-(-15.68049)));
            zz = -7.86944 + (((tickAnim - 43) / 5) * (-11.35558-(-7.86944)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 66.8474 + (((tickAnim - 48) / 12) * (1-(66.8474)));
            yy = -2.56791 + (((tickAnim - 48) / 12) * (0-(-2.56791)));
            zz = -11.35558 + (((tickAnim - 48) / 12) * (-13.25-(-11.35558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 5) * (-0.1-(1.075)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 10) * (0.835-(-0.1)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 0.835 + (((tickAnim - 15) / 9) * (0.4-(0.835)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 24) / 19) * (0-(0)));
            yy = 0.4 + (((tickAnim - 24) / 19) * (0.825-(0.4)));
            zz = 0 + (((tickAnim - 24) / 19) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 43) / 5) * (2.355-(0.825)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 2.355 + (((tickAnim - 48) / 7) * (3.995-(2.355)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 3.995 + (((tickAnim - 55) / 5) * (1.075-(3.995)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.77 + (((tickAnim - 0) / 5) * (0-(16.77)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 24) / 10) * (-51.46-(0)));
            yy = 0 + (((tickAnim - 24) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 10) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -51.46 + (((tickAnim - 34) / 9) * (-55.5-(-51.46)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = -55.5 + (((tickAnim - 43) / 9) * (15.25-(-55.5)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 15.25 + (((tickAnim - 52) / 8) * (16.77-(15.25)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 19) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 24) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 19) * (0.6-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0.6 + (((tickAnim - 43) / 9) * (0-(0.6)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(xx);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(yy);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 15.52174 + (((tickAnim - 0) / 15) * (50.47961-(15.52174)));
            yy = 15.32937 + (((tickAnim - 0) / 15) * (25.77906-(15.32937)));
            zz = -16.82507 + (((tickAnim - 0) / 15) * (-48.21692-(-16.82507)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 50.47961 + (((tickAnim - 15) / 9) * (18.9813-(50.47961)));
            yy = 25.77906 + (((tickAnim - 15) / 9) * (21.75807-(25.77906)));
            zz = -48.21692 + (((tickAnim - 15) / 9) * (-52.41217-(-48.21692)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 18.9813 + (((tickAnim - 24) / 11) * (-18.33244-(18.9813)));
            yy = 21.75807 + (((tickAnim - 24) / 11) * (30.01893-(21.75807)));
            zz = -52.41217 + (((tickAnim - 24) / 11) * (18.56769-(-52.41217)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -18.33244 + (((tickAnim - 35) / 25) * (15.52174-(-18.33244)));
            yy = 30.01893 + (((tickAnim - 35) / 25) * (15.32937-(30.01893)));
            zz = 18.56769 + (((tickAnim - 35) / 25) * (-16.82507-(18.56769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 4.5 + (((tickAnim - 0) / 15) * (22.25-(4.5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 8.75 + (((tickAnim - 0) / 15) * (0-(8.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 22.25 + (((tickAnim - 15) / 7) * (32.1812-(22.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (-4.9189-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (22.83778-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 32.1812 + (((tickAnim - 22) / 6) * (-15.01057-(32.1812)));
            yy = -4.9189 + (((tickAnim - 22) / 6) * (-3.93469-(-4.9189)));
            zz = 22.83778 + (((tickAnim - 22) / 6) * (-1.95194-(22.83778)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -15.01057 + (((tickAnim - 28) / 7) * (-20.70234-(-15.01057)));
            yy = -3.93469 + (((tickAnim - 28) / 7) * (-2.95049-(-3.93469)));
            zz = -1.95194 + (((tickAnim - 28) / 7) * (-26.74165-(-1.95194)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -20.70234 + (((tickAnim - 35) / 25) * (4.5-(-20.70234)));
            yy = -2.95049 + (((tickAnim - 35) / 25) * (0-(-2.95049)));
            zz = -26.74165 + (((tickAnim - 35) / 25) * (8.75-(-26.74165)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (-1.14-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = -0.3 + (((tickAnim - 22) / 13) * (-0.625-(-0.3)));
            zz = -1.14 + (((tickAnim - 22) / 13) * (0.45-(-1.14)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = -0.625 + (((tickAnim - 35) / 25) * (0-(-0.625)));
            zz = 0.45 + (((tickAnim - 35) / 25) * (0-(0.45)));
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
            xx = -9.99887 + (((tickAnim - 0) / 5) * (2.64369-(-9.99887)));
            yy = 0.13052 + (((tickAnim - 0) / 5) * (6.72021-(0.13052)));
            zz = 0.99145 + (((tickAnim - 0) / 5) * (3.37262-(0.99145)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 2.64369 + (((tickAnim - 5) / 6) * (9.94296-(2.64369)));
            yy = 6.72021 + (((tickAnim - 5) / 6) * (11.94704-(6.72021)));
            zz = 3.37262 + (((tickAnim - 5) / 6) * (5.99576-(3.37262)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 9.94296 + (((tickAnim - 11) / 4) * (33.58529-(9.94296)));
            yy = 11.94704 + (((tickAnim - 11) / 4) * (15.68049-(11.94704)));
            zz = 5.99576 + (((tickAnim - 11) / 4) * (7.86944-(5.99576)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 33.58529 + (((tickAnim - 15) / 7) * (65.01401-(33.58529)));
            yy = 15.68049 + (((tickAnim - 15) / 7) * (-24.71718-(15.68049)));
            zz = 7.86944 + (((tickAnim - 15) / 7) * (18.05635-(7.86944)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 65.01401 + (((tickAnim - 22) / 8) * (-11.25-(65.01401)));
            yy = -24.71718 + (((tickAnim - 22) / 8) * (0-(-24.71718)));
            zz = 18.05635 + (((tickAnim - 22) / 8) * (13.25-(18.05635)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 30) / 5) * (20.22814-(-11.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (-0.97397-(0)));
            zz = 13.25 + (((tickAnim - 30) / 5) * (2.57187-(13.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 51) {
            xx = 20.22814 + (((tickAnim - 35) / 16) * (-2.38593-(20.22814)));
            yy = -0.97397 + (((tickAnim - 35) / 16) * (-0.48699-(-0.97397)));
            zz = 2.57187 + (((tickAnim - 35) / 16) * (1.28593-(2.57187)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -2.38593 + (((tickAnim - 51) / 9) * (-9.99887-(-2.38593)));
            yy = -0.48699 + (((tickAnim - 51) / 9) * (0.13052-(-0.48699)));
            zz = 1.28593 + (((tickAnim - 51) / 9) * (0.99145-(1.28593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.9-(0)));
            zz = 0.625 + (((tickAnim - 0) / 5) * (0.375-(0.625)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 5) / 6) * (0.985-(0.9)));
            zz = 0.375 + (((tickAnim - 5) / 6) * (0.16-(0.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.985 + (((tickAnim - 11) / 4) * (0.825-(0.985)));
            zz = 0.16 + (((tickAnim - 11) / 4) * (0-(0.16)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.825 + (((tickAnim - 15) / 7) * (2.355-(0.825)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = 2.355 + (((tickAnim - 22) / 13) * (-0.1-(2.355)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 35) / 16) * (0-(0)));
            yy = -0.1 + (((tickAnim - 35) / 16) * (0.225-(-0.1)));
            zz = 0 + (((tickAnim - 35) / 16) * (0.525-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 0.225 + (((tickAnim - 51) / 9) * (0-(0.225)));
            zz = 0.525 + (((tickAnim - 51) / 9) * (0.625-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-55.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -55.5 + (((tickAnim - 15) / 9) * (35.25-(-55.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 35.25 + (((tickAnim - 24) / 6) * (16.77-(35.25)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 16.77 + (((tickAnim - 30) / 5) * (0-(16.77)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.6-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0.6 + (((tickAnim - 15) / 9) * (0.125-(0.6)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0.125 + (((tickAnim - 24) / 11) * (0-(0.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5+40))*-0.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*-1.2), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*-2.5), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-2));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.75 + (((tickAnim - 0) / 8) * (10.50258-(12.75)));
            yy = -9.25 + (((tickAnim - 0) / 8) * (23.597-(-9.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-30.43754-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 10.50258 + (((tickAnim - 8) / 10) * (0-(10.50258)));
            yy = 23.597 + (((tickAnim - 8) / 10) * (55-(23.597)));
            zz = -30.43754 + (((tickAnim - 8) / 10) * (0-(-30.43754)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 18) / 42) * (12.75-(0)));
            yy = 55 + (((tickAnim - 18) / 42) * (-9.25-(55)));
            zz = 0 + (((tickAnim - 18) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 38.15221 + (((tickAnim - 0) / 12) * (-28.32694-(38.15221)));
            yy = -5.15974 + (((tickAnim - 0) / 12) * (-59.56778-(-5.15974)));
            zz = -2.5622 + (((tickAnim - 0) / 12) * (-0.0233-(-2.5622)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -28.32694 + (((tickAnim - 12) / 6) * (-7.42158-(-28.32694)));
            yy = -59.56778 + (((tickAnim - 12) / 6) * (-50.20811-(-59.56778)));
            zz = -0.0233 + (((tickAnim - 12) / 6) * (1.92148-(-0.0233)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = -7.42158 + (((tickAnim - 18) / 42) * (38.15221-(-7.42158)));
            yy = -50.20811 + (((tickAnim - 18) / 42) * (-5.15974-(-50.20811)));
            zz = 1.92148 + (((tickAnim - 18) / 42) * (-2.5622-(1.92148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.95-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = 0.325 + (((tickAnim - 18) / 42) * (0-(0.325)));
            yy = 0 + (((tickAnim - 18) / 42) * (0-(0)));
            zz = -0.95 + (((tickAnim - 18) / 42) * (0-(-0.95)));
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
            xx = 58.31066 + (((tickAnim - 0) / 4) * (104.7068-(58.31066)));
            yy = -10.04879 + (((tickAnim - 0) / 4) * (-9.45352-(-10.04879)));
            zz = 7.88779 + (((tickAnim - 0) / 4) * (10.21266-(7.88779)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 104.7068 + (((tickAnim - 4) / 8) * (94.79661-(104.7068)));
            yy = -9.45352 + (((tickAnim - 4) / 8) * (-3.51509-(-9.45352)));
            zz = 10.21266 + (((tickAnim - 4) / 8) * (4.54638-(10.21266)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 94.79661 + (((tickAnim - 12) / 6) * (11.78255-(94.79661)));
            yy = -3.51509 + (((tickAnim - 12) / 6) * (3.0186-(-3.51509)));
            zz = 4.54638 + (((tickAnim - 12) / 6) * (1.20496-(4.54638)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 11.78255 + (((tickAnim - 18) / 20) * (-16.53625-(11.78255)));
            yy = 3.0186 + (((tickAnim - 18) / 20) * (-6.72536-(3.0186)));
            zz = 1.20496 + (((tickAnim - 18) / 20) * (0.5616-(1.20496)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = -16.53625 + (((tickAnim - 38) / 22) * (58.31066-(-16.53625)));
            yy = -6.72536 + (((tickAnim - 38) / 22) * (-10.04879-(-6.72536)));
            zz = 0.5616 + (((tickAnim - 38) / 22) * (7.88779-(0.5616)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 4) * (-0.09-(-0.35)));
            zz = -1.45 + (((tickAnim - 0) / 4) * (-0.635-(-1.45)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -0.09 + (((tickAnim - 4) / 8) * (0-(-0.09)));
            zz = -0.635 + (((tickAnim - 4) / 8) * (0-(-0.635)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (-0.115-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = -0.17 + (((tickAnim - 38) / 22) * (-0.35-(-0.17)));
            zz = -0.115 + (((tickAnim - 38) / 22) * (-1.45-(-0.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-50))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-100))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*3), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-40))*-1.4), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-90))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-1.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-130))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-160))*-1), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-190))*-1), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-1.25), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-230))*-2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-280))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-300))*7));



        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 1.735 + (((tickAnim - 0) / 27) * (12.75-(1.735)));
            yy = -44.46989 + (((tickAnim - 0) / 27) * (9.25-(-44.46989)));
            zz = -2.78649 + (((tickAnim - 0) / 27) * (0-(-2.78649)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 27) / 8) * (10.50258-(12.75)));
            yy = 9.25 + (((tickAnim - 27) / 8) * (-23.597-(9.25)));
            zz = 0 + (((tickAnim - 27) / 8) * (30.43754-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 10.50258 + (((tickAnim - 35) / 13) * (0-(10.50258)));
            yy = -23.597 + (((tickAnim - 35) / 13) * (-55-(-23.597)));
            zz = 30.43754 + (((tickAnim - 35) / 13) * (0-(30.43754)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (1.735-(0)));
            yy = -55 + (((tickAnim - 48) / 12) * (-44.46989-(-55)));
            zz = 0 + (((tickAnim - 48) / 12) * (-2.78649-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = -1.42158 + (((tickAnim - 0) / 27) * (38.15221-(-1.42158)));
            yy = 50.20811 + (((tickAnim - 0) / 27) * (5.15974-(50.20811)));
            zz = -1.92148 + (((tickAnim - 0) / 27) * (2.5622-(-1.92148)));
        }
        else if (tickAnim >= 27 && tickAnim < 39) {
            xx = 38.15221 + (((tickAnim - 27) / 12) * (-28.32694-(38.15221)));
            yy = 5.15974 + (((tickAnim - 27) / 12) * (59.56778-(5.15974)));
            zz = 2.5622 + (((tickAnim - 27) / 12) * (0.0233-(2.5622)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -28.32694 + (((tickAnim - 39) / 9) * (-7.42158-(-28.32694)));
            yy = 59.56778 + (((tickAnim - 39) / 9) * (50.20811-(59.56778)));
            zz = 0.0233 + (((tickAnim - 39) / 9) * (-1.92148-(0.0233)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -7.42158 + (((tickAnim - 48) / 12) * (-1.42158-(-7.42158)));
            yy = 50.20811 + (((tickAnim - 48) / 12) * (50.20811-(50.20811)));
            zz = -1.92148 + (((tickAnim - 48) / 12) * (-1.92148-(-1.92148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0.325 + (((tickAnim - 0) / 27) * (0-(0.325)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = -0.95 + (((tickAnim - 0) / 27) * (0-(-0.95)));
        }
        else if (tickAnim >= 27 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 27) / 21) * (0.325-(0)));
            yy = 0 + (((tickAnim - 27) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 21) * (-0.95-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0.325 + (((tickAnim - 48) / 12) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = -0.95 + (((tickAnim - 48) / 12) * (-0.95-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 3.86104 + (((tickAnim - 0) / 15) * (-18.33962-(3.86104)));
            yy = -0.28251 + (((tickAnim - 0) / 15) * (8.4112-(-0.28251)));
            zz = -11.17439 + (((tickAnim - 0) / 15) * (-1.22983-(-11.17439)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = -18.33962 + (((tickAnim - 15) / 12) * (58.31066-(-18.33962)));
            yy = 8.4112 + (((tickAnim - 15) / 12) * (-10.04879-(8.4112)));
            zz = -1.22983 + (((tickAnim - 15) / 12) * (7.88779-(-1.22983)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 58.31066 + (((tickAnim - 27) / 5) * (104.7068-(58.31066)));
            yy = -10.04879 + (((tickAnim - 27) / 5) * (-9.45352-(-10.04879)));
            zz = 7.88779 + (((tickAnim - 27) / 5) * (10.21266-(7.88779)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 104.7068 + (((tickAnim - 32) / 7) * (94.79661-(104.7068)));
            yy = -9.45352 + (((tickAnim - 32) / 7) * (-3.51509-(-9.45352)));
            zz = 10.21266 + (((tickAnim - 32) / 7) * (4.54638-(10.21266)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 94.79661 + (((tickAnim - 39) / 9) * (11.78255-(94.79661)));
            yy = -3.51509 + (((tickAnim - 39) / 9) * (3.0186-(-3.51509)));
            zz = 4.54638 + (((tickAnim - 39) / 9) * (1.20496-(4.54638)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 11.78255 + (((tickAnim - 48) / 12) * (3.86104-(11.78255)));
            yy = 3.0186 + (((tickAnim - 48) / 12) * (-0.28251-(3.0186)));
            zz = 1.20496 + (((tickAnim - 48) / 12) * (-11.17439-(1.20496)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = -0.35 + (((tickAnim - 0) / 15) * (-0.1-(-0.35)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (-0.35-(0)));
            zz = -0.1 + (((tickAnim - 15) / 12) * (-1.45-(-0.1)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 27) / 5) * (-0.09-(-0.35)));
            zz = -1.45 + (((tickAnim - 27) / 5) * (-0.635-(-1.45)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = -0.09 + (((tickAnim - 32) / 7) * (0-(-0.09)));
            zz = -0.635 + (((tickAnim - 32) / 7) * (0-(-0.635)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);
    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-0.2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(54.9375+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), backrightleg.rotateAngleY + (float) Math.toRadians(-42.78165), backrightleg.rotateAngleZ + (float) Math.toRadians(49.55317));
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(1.125);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(0);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(24.24462), backrightleg2.rotateAngleY + (float) Math.toRadians(-9.84626), backrightleg2.rotateAngleZ + (float) Math.toRadians(-21.76579));


        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(138.7876+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*4), backrightleg3.rotateAngleY + (float) Math.toRadians(76.02931), backrightleg3.rotateAngleZ + (float) Math.toRadians(53.5333));
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(0);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(0);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(0);


        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*4), backrightleg4.rotateAngleY + (float) Math.toRadians(0), backrightleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backrightleg4.rotationPointX = this.backrightleg4.rotationPointX + (float)(0);
        this.backrightleg4.rotationPointY = this.backrightleg4.rotationPointY - (float)(0);
        this.backrightleg4.rotationPointZ = this.backrightleg4.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(54.9375+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), backleftleg.rotateAngleY + (float) Math.toRadians(42.78165), backleftleg.rotateAngleZ + (float) Math.toRadians(-49.55317));
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(-1.125);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(0);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(24.24462), backleftleg2.rotateAngleY + (float) Math.toRadians(9.84626), backleftleg2.rotateAngleZ + (float) Math.toRadians(21.76579));


        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(138.7876+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-4), backleftleg3.rotateAngleY + (float) Math.toRadians(-76.02931), backleftleg3.rotateAngleZ + (float) Math.toRadians(-53.5333));
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(0);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(0);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(0);


        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-4), backleftleg4.rotateAngleY + (float) Math.toRadians(0), backleftleg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(0);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(0);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*0.5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(15.5), frontleftleg.rotateAngleY + (float) Math.toRadians(0), frontleftleg.rotateAngleZ + (float) Math.toRadians(0));
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(-1.1);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(0);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(74.99207), frontleftleg2.rotateAngleY + (float) Math.toRadians(20.86369), frontleftleg2.rotateAngleZ + (float) Math.toRadians(-8.44168));
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(0);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(0);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(-0.625);


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(93.54515), frontleftleg3.rotateAngleY + (float) Math.toRadians(-7.48636), frontleftleg3.rotateAngleZ + (float) Math.toRadians(-88.20909));
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(-0.425);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(0);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(-1.3);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-300))*1), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(7.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*3), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(7.25), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+20))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-4.75), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*11), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*14), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-1.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-17), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(14.87977), frontrightleg.rotateAngleY + (float) Math.toRadians(4.07305), frontrightleg.rotateAngleZ + (float) Math.toRadians(-14.96042));
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(1.1);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(0);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(0);


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(74.99207), frontrightleg2.rotateAngleY + (float) Math.toRadians(-20.86369), frontrightleg2.rotateAngleZ + (float) Math.toRadians(8.44168));
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(0);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(0);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(-0.625);


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(93.54515), frontrightleg3.rotateAngleY + (float) Math.toRadians(7.48636), frontrightleg3.rotateAngleZ + (float) Math.toRadians(88.20909));
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(-0.425);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(0);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(-1.3);
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.16377-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.94969-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.33387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 12.16377 + (((tickAnim - 5) / 4) * (16.84014-(12.16377)));
            yy = -7.94969 + (((tickAnim - 5) / 4) * (-8.51315-(-7.94969)));
            zz = -0.33387 + (((tickAnim - 5) / 4) * (-3.31117-(-0.33387)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 16.84014 + (((tickAnim - 9) / 7) * (-10.25-(16.84014)));
            yy = -8.51315 + (((tickAnim - 9) / 7) * (0-(-8.51315)));
            zz = -3.31117 + (((tickAnim - 9) / 7) * (0-(-3.31117)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.25 + (((tickAnim - 16) / 3) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 19) / 4) * (-10.19686-(-10.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.53568-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-3.96333-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.19686 + (((tickAnim - 23) / 4) * (-15.84843-(-10.19686)));
            yy = -1.53568 + (((tickAnim - 23) / 4) * (-0.76784-(-1.53568)));
            zz = -3.96333 + (((tickAnim - 23) / 4) * (-1.98166-(-3.96333)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.84843 + (((tickAnim - 27) / 3) * (-15.34843-(-15.84843)));
            yy = -0.76784 + (((tickAnim - 27) / 3) * (-0.76784-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 27) / 3) * (-1.98166-(-1.98166)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.34843 + (((tickAnim - 30) / 5) * (0-(-15.34843)));
            yy = -0.76784 + (((tickAnim - 30) / 5) * (0-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 30) / 5) * (0-(-1.98166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.89347-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.03535-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.89347 + (((tickAnim - 5) / 4) * (11.48596-(4.89347)));
            yy = 14.03535 + (((tickAnim - 5) / 4) * (17.04317-(14.03535)));
            zz = -2.75415 + (((tickAnim - 5) / 4) * (-1.4762-(-2.75415)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.48596 + (((tickAnim - 9) / 3) * (13.28126-(11.48596)));
            yy = 17.04317 + (((tickAnim - 9) / 3) * (9.94947-(17.04317)));
            zz = -1.4762 + (((tickAnim - 9) / 3) * (-5.56616-(-1.4762)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 13.28126 + (((tickAnim - 12) / 2) * (-8.78697-(13.28126)));
            yy = 9.94947 + (((tickAnim - 12) / 2) * (7.5849-(9.94947)));
            zz = -5.56616 + (((tickAnim - 12) / 2) * (-6.92949-(-5.56616)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.78697 + (((tickAnim - 14) / 4) * (1-(-8.78697)));
            yy = 7.5849 + (((tickAnim - 14) / 4) * (0-(7.5849)));
            zz = -6.92949 + (((tickAnim - 14) / 4) * (0-(-6.92949)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (-19.98527-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.37617-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.48428-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.98527 + (((tickAnim - 23) / 4) * (-0.24264-(-19.98527)));
            yy = -0.37617 + (((tickAnim - 23) / 4) * (-0.18808-(-0.37617)));
            zz = -4.48428 + (((tickAnim - 23) / 4) * (-2.24214-(-4.48428)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.24264 + (((tickAnim - 27) / 3) * (-0.24264-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 27) / 3) * (-0.18808-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 27) / 3) * (-2.24214-(-2.24214)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.24264 + (((tickAnim - 30) / 5) * (0-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 30) / 5) * (0-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 30) / 5) * (0-(-2.24214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 5) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 14) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 19.5 + (((tickAnim - 22) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animCall(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 20) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 20) / 6) * (14-(12)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 560;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.175-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = -6.175 + (((tickAnim - 30) / 470) * (-6.175-(-6.175)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = -6.175 + (((tickAnim - 500) / 25) * (-3.175-(-6.175)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = -3.175 + (((tickAnim - 525) / 35) * (0-(-3.175)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (31.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -18 + (((tickAnim - 30) / 470) * (-18-(-18)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 31.5 + (((tickAnim - 30) / 470) * (31.5-(31.5)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -18 + (((tickAnim - 500) / 25) * (4.25-(-18)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 31.5 + (((tickAnim - 500) / 25) * (31.5-(31.5)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 4.25 + (((tickAnim - 525) / 35) * (0-(4.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 31.5 + (((tickAnim - 525) / 35) * (0-(31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.61994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 11.61994 + (((tickAnim - 30) / 470) * (11.61994-(11.61994)));
            yy = 6.78195 + (((tickAnim - 30) / 470) * (6.78195-(6.78195)));
            zz = -4.74239 + (((tickAnim - 30) / 470) * (-4.74239-(-4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 11.61994 + (((tickAnim - 500) / 25) * (11.61994-(11.61994)));
            yy = 6.78195 + (((tickAnim - 500) / 25) * (6.78195-(6.78195)));
            zz = -4.74239 + (((tickAnim - 500) / 25) * (-4.74239-(-4.74239)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 11.61994 + (((tickAnim - 525) / 35) * (0-(11.61994)));
            yy = 6.78195 + (((tickAnim - 525) / 35) * (0-(6.78195)));
            zz = -4.74239 + (((tickAnim - 525) / 35) * (0-(-4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (9.77712-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.92008-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-33.87705-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 9.77712 + (((tickAnim - 30) / 470) * (9.77712-(9.77712)));
            yy = -0.92008 + (((tickAnim - 30) / 470) * (-0.92008-(-0.92008)));
            zz = -33.87705 + (((tickAnim - 30) / 470) * (-33.87705-(-33.87705)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 9.77712 + (((tickAnim - 500) / 25) * (-3.68607-(9.77712)));
            yy = -0.92008 + (((tickAnim - 500) / 25) * (-0.62148-(-0.92008)));
            zz = -33.87705 + (((tickAnim - 500) / 25) * (-18.12842-(-33.87705)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -3.68607 + (((tickAnim - 525) / 35) * (0-(-3.68607)));
            yy = -0.62148 + (((tickAnim - 525) / 35) * (0-(-0.62148)));
            zz = -18.12842 + (((tickAnim - 525) / 35) * (0-(-18.12842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 470) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            yy = 0.85 + (((tickAnim - 500) / 60) * (0-(0.85)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-31.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -18 + (((tickAnim - 30) / 470) * (-18-(-18)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = -31.5 + (((tickAnim - 30) / 470) * (-31.5-(-31.5)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -18 + (((tickAnim - 500) / 25) * (4.25-(-18)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = -31.5 + (((tickAnim - 500) / 25) * (-31.5-(-31.5)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 4.25 + (((tickAnim - 525) / 35) * (0-(4.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = -31.5 + (((tickAnim - 525) / 35) * (0-(-31.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.61994-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.78195-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (4.74239-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 11.61994 + (((tickAnim - 30) / 470) * (11.61994-(11.61994)));
            yy = -6.78195 + (((tickAnim - 30) / 470) * (-6.78195-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 30) / 470) * (4.74239-(4.74239)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 11.61994 + (((tickAnim - 500) / 25) * (11.61994-(11.61994)));
            yy = -6.78195 + (((tickAnim - 500) / 25) * (-6.78195-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 500) / 25) * (4.74239-(4.74239)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 11.61994 + (((tickAnim - 525) / 35) * (0-(11.61994)));
            yy = -6.78195 + (((tickAnim - 525) / 35) * (0-(-6.78195)));
            zz = 4.74239 + (((tickAnim - 525) / 35) * (0-(4.74239)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (9.77712-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.92008-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (33.87705-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 9.77712 + (((tickAnim - 30) / 470) * (9.77712-(9.77712)));
            yy = 0.92008 + (((tickAnim - 30) / 470) * (0.92008-(0.92008)));
            zz = 33.87705 + (((tickAnim - 30) / 470) * (33.87705-(33.87705)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 9.77712 + (((tickAnim - 500) / 25) * (-3.68607-(9.77712)));
            yy = 0.92008 + (((tickAnim - 500) / 25) * (0.62148-(0.92008)));
            zz = 33.87705 + (((tickAnim - 500) / 25) * (18.12842-(33.87705)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -3.68607 + (((tickAnim - 525) / 35) * (0-(-3.68607)));
            yy = 0.62148 + (((tickAnim - 525) / 35) * (0-(0.62148)));
            zz = 18.12842 + (((tickAnim - 525) / 35) * (0-(18.12842)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 470) * (0.85-(0.85)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            yy = 0.85 + (((tickAnim - 500) / 60) * (0-(0.85)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-41.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = -41.75 + (((tickAnim - 23) / 11) * (-55-(-41.75)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (7.77241-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (-9.07069-(0)));
            zz = -55 + (((tickAnim - 34) / 11) * (-27.12231-(-55)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 7.77241 + (((tickAnim - 45) / 455) * (7.77241-(7.77241)));
            yy = -9.07069 + (((tickAnim - 45) / 455) * (-9.07069-(-9.07069)));
            zz = -27.12231 + (((tickAnim - 45) / 455) * (-27.12231-(-27.12231)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 7.77241 + (((tickAnim - 500) / 25) * (8.19796-(7.77241)));
            yy = -9.07069 + (((tickAnim - 500) / 25) * (-8.68859-(-9.07069)));
            zz = -27.12231 + (((tickAnim - 500) / 25) * (-29.87868-(-27.12231)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 8.19796 + (((tickAnim - 525) / 35) * (0-(8.19796)));
            yy = -8.68859 + (((tickAnim - 525) / 35) * (0-(-8.68859)));
            zz = -29.87868 + (((tickAnim - 525) / 35) * (0-(-29.87868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (-3.5675-(0)));
            yy = 0 + (((tickAnim - 23) / 11) * (-13.00824-(0)));
            zz = 0 + (((tickAnim - 23) / 11) * (-28.2829-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -3.5675 + (((tickAnim - 34) / 11) * (-39.25694-(-3.5675)));
            yy = -13.00824 + (((tickAnim - 34) / 11) * (-10.43931-(-13.00824)));
            zz = -28.2829 + (((tickAnim - 34) / 11) * (-44.79781-(-28.2829)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = -39.25694 + (((tickAnim - 45) / 455) * (-39.25694-(-39.25694)));
            yy = -10.43931 + (((tickAnim - 45) / 455) * (-10.43931-(-10.43931)));
            zz = -44.79781 + (((tickAnim - 45) / 455) * (-44.79781-(-44.79781)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -39.25694 + (((tickAnim - 500) / 25) * (-16.3069-(-39.25694)));
            yy = -10.43931 + (((tickAnim - 500) / 25) * (54.33748-(-10.43931)));
            zz = -44.79781 + (((tickAnim - 500) / 25) * (-23.02552-(-44.79781)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -16.3069 + (((tickAnim - 525) / 35) * (0-(-16.3069)));
            yy = 54.33748 + (((tickAnim - 525) / 35) * (0-(54.33748)));
            zz = -23.02552 + (((tickAnim - 525) / 35) * (0-(-23.02552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 11) * (0-(0.975)));
            zz = 0 + (((tickAnim - 23) / 11) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 45) / 455) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 455) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 455) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.85362-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-40.82602-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-11.74065-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 7.85362 + (((tickAnim - 23) / 11) * (86.66828-(7.85362)));
            yy = -40.82602 + (((tickAnim - 23) / 11) * (-49.16764-(-40.82602)));
            zz = -11.74065 + (((tickAnim - 23) / 11) * (-62.20903-(-11.74065)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 86.66828 + (((tickAnim - 34) / 11) * (69.10203-(86.66828)));
            yy = -49.16764 + (((tickAnim - 34) / 11) * (-20.93997-(-49.16764)));
            zz = -62.20903 + (((tickAnim - 34) / 11) * (-66.63924-(-62.20903)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 69.10203 + (((tickAnim - 45) / 455) * (69.10203-(69.10203)));
            yy = -20.93997 + (((tickAnim - 45) / 455) * (-20.93997-(-20.93997)));
            zz = -66.63924 + (((tickAnim - 45) / 455) * (-66.63924-(-66.63924)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 69.10203 + (((tickAnim - 500) / 25) * (1.36627-(69.10203)));
            yy = -20.93997 + (((tickAnim - 500) / 25) * (-28.27462-(-20.93997)));
            zz = -66.63924 + (((tickAnim - 500) / 25) * (-60.18488-(-66.63924)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1.36627 + (((tickAnim - 525) / 35) * (0-(1.36627)));
            yy = -28.27462 + (((tickAnim - 525) / 35) * (0-(-28.27462)));
            zz = -60.18488 + (((tickAnim - 525) / 35) * (0-(-60.18488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 34) {
            xx = 0.275 + (((tickAnim - 23) / 11) * (0.85-(0.275)));
            yy = 0 + (((tickAnim - 23) / 11) * (0-(0)));
            zz = -0.575 + (((tickAnim - 23) / 11) * (0-(-0.575)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0.85 + (((tickAnim - 34) / 11) * (0.65-(0.85)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 500) {
            xx = 0.65 + (((tickAnim - 45) / 455) * (0.65-(0.65)));
            yy = 0 + (((tickAnim - 45) / 455) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 455) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0.65 + (((tickAnim - 500) / 25) * (0-(0.65)));
            yy = 0 + (((tickAnim - 500) / 25) * (0.7-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (-0.95-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0.7 + (((tickAnim - 525) / 35) * (0-(0.7)));
            zz = -0.95 + (((tickAnim - 525) / 35) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = -11.75 + (((tickAnim - 30) / 59) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = -11.75 + (((tickAnim - 89) / 1) * (-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3-(-11.75)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = -14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3 + (((tickAnim - 90) / 40) * (-15.5-(-14.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*-3)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = -15.5 + (((tickAnim - 130) / 370) * (-11.75-(-15.5)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -11.75 + (((tickAnim - 500) / 25) * (-15.5-(-11.75)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -15.5 + (((tickAnim - 525) / 35) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 89) {
            xx = 5.5 + (((tickAnim - 30) / 59) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 30) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 59) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = 5.5 + (((tickAnim - 89) / 1) * (5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5-(5.5)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 130) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5 + (((tickAnim - 90) / 40) * (0.75-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-5)));
            yy = 0 + (((tickAnim - 90) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 40) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 0.75 + (((tickAnim - 130) / 370) * (-8.5-(0.75)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 540) {
            xx = -8.5 + (((tickAnim - 500) / 40) * (14.25-(-8.5)));
            yy = 0 + (((tickAnim - 500) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 40) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = 14.25 + (((tickAnim - 540) / 20) * (0-(14.25)));
            yy = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 87 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 87) / 1) * (3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20-(0)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 130) {
            xx = 3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20 + (((tickAnim - 88) / 42) * (19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2-(3.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*20)));
            yy = 0 + (((tickAnim - 88) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 42) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 500) {
            xx = 19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2 + (((tickAnim - 130) / 370) * (30-(19.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50/0.5))*0.2)));
            yy = 0 + (((tickAnim - 130) / 370) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 370) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 512) {
            xx = 30 + (((tickAnim - 500) / 12) * (0-(30)));
            yy = 0 + (((tickAnim - 500) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 87 && tickAnim < 132) {
            xx = 0 + (((tickAnim - 87) / 45) * (-6-(0)));
            yy = 0 + (((tickAnim - 87) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 45) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 500) {
            xx = -6 + (((tickAnim - 132) / 368) * (-16-(-6)));
            yy = 0 + (((tickAnim - 132) / 368) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 368) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 512) {
            xx = -16 + (((tickAnim - 500) / 12) * (0-(-16)));
            yy = 0 + (((tickAnim - 500) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 0 + (((tickAnim - 130) / 318) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 318) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 318) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 448) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 448) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 12) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 40) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(xx);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(yy);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 53) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 53) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 9) * (-0.16-(1)));
            zz = 1 + (((tickAnim - 53) / 9) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (1-(1)));
            yy = -0.16 + (((tickAnim - 62) / 8) * (1-(-0.16)));
            zz = 1 + (((tickAnim - 62) / 8) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 17) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 87) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 87) / 43) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 87) / 43) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 1 + (((tickAnim - 130) / 318) * (1-(1)));
            yy = -0.01 + (((tickAnim - 130) / 318) * (-0.01-(-0.01)));
            zz = 1 + (((tickAnim - 130) / 318) * (1-(1)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 448) / 12) * (1-(1)));
            yy = -0.01 + (((tickAnim - 448) / 12) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 448) / 12) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            zz = 1 + (((tickAnim - 460) / 40) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 500) / 25) * (1-(1)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 525) / 35) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 53) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 34) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 0 + (((tickAnim - 130) / 318) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 318) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 318) * (0-(0)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 448) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 448) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 448) / 12) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 40) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(xx);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(yy);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 53) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 53) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 62) {
            xx = 1 + (((tickAnim - 53) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 53) / 9) * (-0.16-(1)));
            zz = 1 + (((tickAnim - 53) / 9) * (1-(1)));
        }
        else if (tickAnim >= 62 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 62) / 8) * (1-(1)));
            yy = -0.16 + (((tickAnim - 62) / 8) * (1-(-0.16)));
            zz = 1 + (((tickAnim - 62) / 8) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 87) {
            xx = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 17) * (1-(1)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 1 + (((tickAnim - 87) / 43) * (1-(1)));
            yy = 1 + (((tickAnim - 87) / 43) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 87) / 43) * (1-(1)));
        }
        else if (tickAnim >= 130 && tickAnim < 448) {
            xx = 1 + (((tickAnim - 130) / 318) * (1-(1)));
            yy = -0.01 + (((tickAnim - 130) / 318) * (-0.01-(-0.01)));
            zz = 1 + (((tickAnim - 130) / 318) * (1-(1)));
        }
        else if (tickAnim >= 448 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 448) / 12) * (1-(1)));
            yy = -0.01 + (((tickAnim - 448) / 12) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 448) / 12) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            yy = 1 + (((tickAnim - 460) / 40) * (1-(1)));
            zz = 1 + (((tickAnim - 460) / 40) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 500) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 500) / 25) * (1-(1)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            yy = 1 + (((tickAnim - 525) / 35) * (1-(1)));
            zz = 1 + (((tickAnim - 525) / 35) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 17.5 + (((tickAnim - 30) / 470) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 17.5 + (((tickAnim - 500) / 25) * (6.5-(17.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.5 + (((tickAnim - 525) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -7.5 + (((tickAnim - 30) / 470) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -7.5 + (((tickAnim - 500) / 25) * (6.25-(-7.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 6.25 + (((tickAnim - 525) / 35) * (0-(6.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -5.5 + (((tickAnim - 30) / 470) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 500) / 60) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -5 + (((tickAnim - 30) / 470) * (-5-(-5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -5 + (((tickAnim - 500) / 25) * (-7.25-(-5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -7.25 + (((tickAnim - 525) / 35) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -0.5 + (((tickAnim - 30) / 470) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -0.5 + (((tickAnim - 500) / 25) * (-5.5-(-0.5)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -5.5 + (((tickAnim - 525) / 35) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (6.21025-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-14.26639-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (18.6574-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 6.21025 + (((tickAnim - 9) / 14) * (22.82152-(6.21025)));
            yy = -14.26639 + (((tickAnim - 9) / 14) * (-2.82063-(-14.26639)));
            zz = 18.6574 + (((tickAnim - 9) / 14) * (6.38132-(18.6574)));
        }
        else if (tickAnim >= 23 && tickAnim < 500) {
            xx = 22.82152 + (((tickAnim - 23) / 477) * (22.82152-(22.82152)));
            yy = -2.82063 + (((tickAnim - 23) / 477) * (-2.82063-(-2.82063)));
            zz = 6.38132 + (((tickAnim - 23) / 477) * (6.38132-(6.38132)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 22.82152 + (((tickAnim - 500) / 25) * (8.19796-(22.82152)));
            yy = -2.82063 + (((tickAnim - 500) / 25) * (8.68859-(-2.82063)));
            zz = 6.38132 + (((tickAnim - 500) / 25) * (29.87868-(6.38132)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 8.19796 + (((tickAnim - 525) / 35) * (0-(8.19796)));
            yy = 8.68859 + (((tickAnim - 525) / 35) * (0-(8.68859)));
            zz = 29.87868 + (((tickAnim - 525) / 35) * (0-(29.87868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-38.42289-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (27.52672-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (30.21138-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -38.42289 + (((tickAnim - 9) / 14) * (-37.3932-(-38.42289)));
            yy = 27.52672 + (((tickAnim - 9) / 14) * (-0.06843-(27.52672)));
            zz = 30.21138 + (((tickAnim - 9) / 14) * (50.52709-(30.21138)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -37.3932 + (((tickAnim - 23) / 7) * (-40.27186-(-37.3932)));
            yy = -0.06843 + (((tickAnim - 23) / 7) * (12.66405-(-0.06843)));
            zz = 50.52709 + (((tickAnim - 23) / 7) * (73.96024-(50.52709)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -40.27186 + (((tickAnim - 30) / 470) * (-40.27186-(-40.27186)));
            yy = 12.66405 + (((tickAnim - 30) / 470) * (12.66405-(12.66405)));
            zz = 73.96024 + (((tickAnim - 30) / 470) * (73.96024-(73.96024)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -40.27186 + (((tickAnim - 500) / 25) * (-16.3069-(-40.27186)));
            yy = 12.66405 + (((tickAnim - 500) / 25) * (-54.33748-(12.66405)));
            zz = 73.96024 + (((tickAnim - 500) / 25) * (23.02552-(73.96024)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = -16.3069 + (((tickAnim - 525) / 35) * (0-(-16.3069)));
            yy = -54.33748 + (((tickAnim - 525) / 35) * (0-(-54.33748)));
            zz = 23.02552 + (((tickAnim - 525) / 35) * (0-(23.02552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (0-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 525) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (95.18064-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (5.20559-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (8.88593-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 95.18064 + (((tickAnim - 9) / 14) * (34.50496-(95.18064)));
            yy = 5.20559 + (((tickAnim - 9) / 14) * (16.99132-(5.20559)));
            zz = 8.88593 + (((tickAnim - 9) / 14) * (69.18846-(8.88593)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 34.50496 + (((tickAnim - 23) / 7) * (57.932-(34.50496)));
            yy = 16.99132 + (((tickAnim - 23) / 7) * (24.38306-(16.99132)));
            zz = 69.18846 + (((tickAnim - 23) / 7) * (78.17309-(69.18846)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = 57.932 + (((tickAnim - 30) / 470) * (57.932-(57.932)));
            yy = 24.38306 + (((tickAnim - 30) / 470) * (24.38306-(24.38306)));
            zz = 78.17309 + (((tickAnim - 30) / 470) * (78.17309-(78.17309)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = 57.932 + (((tickAnim - 500) / 25) * (1.36627-(57.932)));
            yy = 24.38306 + (((tickAnim - 500) / 25) * (28.27462-(24.38306)));
            zz = 78.17309 + (((tickAnim - 500) / 25) * (60.18488-(78.17309)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 1.36627 + (((tickAnim - 525) / 35) * (0-(1.36627)));
            yy = 28.27462 + (((tickAnim - 525) / 35) * (0-(28.27462)));
            zz = 60.18488 + (((tickAnim - 525) / 35) * (0-(60.18488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-1.175-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.975-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1.175 + (((tickAnim - 23) / 7) * (-1.325-(-1.175)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -0.975 + (((tickAnim - 23) / 7) * (0-(-0.975)));
        }
        else if (tickAnim >= 30 && tickAnim < 500) {
            xx = -1.325 + (((tickAnim - 30) / 470) * (-1.325-(-1.325)));
            yy = 0 + (((tickAnim - 30) / 470) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 470) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 525) {
            xx = -1.325 + (((tickAnim - 500) / 25) * (0-(-1.325)));
            yy = 0 + (((tickAnim - 500) / 25) * (0.7-(0)));
            zz = 0 + (((tickAnim - 500) / 25) * (-0.95-(0)));
        }
        else if (tickAnim >= 525 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 525) / 35) * (0-(0)));
            yy = 0.7 + (((tickAnim - 525) / 35) * (0-(0.7)));
            zz = -0.95 + (((tickAnim - 525) / 35) * (0-(-0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (52.97301-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.91434-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-21.58489-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 52.97301 + (((tickAnim - 20) / 13) * (34.21811-(52.97301)));
            yy = 12.91434 + (((tickAnim - 20) / 13) * (11.96439-(12.91434)));
            zz = -21.58489 + (((tickAnim - 20) / 13) * (-33.92989-(-21.58489)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 34.21811 + (((tickAnim - 33) / 17) * (0-(34.21811)));
            yy = 11.96439 + (((tickAnim - 33) / 17) * (0-(11.96439)));
            zz = -33.92989 + (((tickAnim - 33) / 17) * (0-(-33.92989)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.21155-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (25.94358-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-8.28206-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 29.21155 + (((tickAnim - 20) / 6) * (12.62919-(29.21155)));
            yy = 25.94358 + (((tickAnim - 20) / 6) * (21.3543-(25.94358)));
            zz = -8.28206 + (((tickAnim - 20) / 6) * (-10.50773-(-8.28206)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 12.62919 + (((tickAnim - 26) / 7) * (-12.71659-(12.62919)));
            yy = 21.3543 + (((tickAnim - 26) / 7) * (24.63236-(21.3543)));
            zz = -10.50773 + (((tickAnim - 26) / 7) * (-22.50205-(-10.50773)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -12.71659 + (((tickAnim - 33) / 17) * (0-(-12.71659)));
            yy = 24.63236 + (((tickAnim - 33) / 17) * (0-(24.63236)));
            zz = -22.50205 + (((tickAnim - 33) / 17) * (0-(-22.50205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.65-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.425-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 26) / 7) * (1.295-(0.65)));
            zz = -0.425 + (((tickAnim - 26) / 7) * (-0.31-(-0.425)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.295 + (((tickAnim - 33) / 17) * (0-(1.295)));
            zz = -0.31 + (((tickAnim - 33) / 17) * (0-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-23.52-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -23.52 + (((tickAnim - 9) / 11) * (30.5-(-23.52)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 30.5 + (((tickAnim - 20) / 13) * (66.75-(30.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 66.75 + (((tickAnim - 33) / 5) * (12.21253-(66.75)));
            yy = 0 + (((tickAnim - 33) / 5) * (2.58986-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (9.49073-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 12.21253 + (((tickAnim - 38) / 5) * (-8.53388-(12.21253)));
            yy = 2.58986 + (((tickAnim - 38) / 5) * (4.80975-(2.58986)));
            zz = 9.49073 + (((tickAnim - 38) / 5) * (17.62565-(9.49073)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.53388 + (((tickAnim - 43) / 7) * (0-(-8.53388)));
            yy = 4.80975 + (((tickAnim - 43) / 7) * (0-(4.80975)));
            zz = 17.62565 + (((tickAnim - 43) / 7) * (0-(17.62565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0.425 + (((tickAnim - 20) / 6) * (3.945-(0.425)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.095-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 3.945 + (((tickAnim - 26) / 7) * (3.76-(3.945)));
            zz = -0.095 + (((tickAnim - 26) / 7) * (-0.2-(-0.095)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 3.76 + (((tickAnim - 33) / 10) * (1.635-(3.76)));
            zz = -0.2 + (((tickAnim - 33) / 10) * (0.615-(-0.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.635 + (((tickAnim - 43) / 7) * (0-(1.635)));
            zz = 0.615 + (((tickAnim - 43) / 7) * (0-(0.615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.58-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -7.58 + (((tickAnim - 9) / 11) * (-99.5-(-7.58)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -99.5 + (((tickAnim - 20) / 6) * (23.33-(-99.5)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 23.33 + (((tickAnim - 26) / 7) * (22.5-(23.33)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 33) / 17) * (0-(22.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg4, backleftleg4.rotateAngleX + (float) Math.toRadians(xx), backleftleg4.rotateAngleY + (float) Math.toRadians(yy), backleftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (1.05-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 14) / 6) * (-0.225-(-0.1)));
            zz = 1.05 + (((tickAnim - 14) / 6) * (-0.55-(1.05)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 20) / 6) * (-0.04-(-0.225)));
            zz = -0.55 + (((tickAnim - 20) / 6) * (0.105-(-0.55)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.04 + (((tickAnim - 26) / 7) * (0-(-0.04)));
            zz = 0.105 + (((tickAnim - 26) / 7) * (0.075-(0.105)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0.075 + (((tickAnim - 33) / 17) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg4.rotationPointX = this.backleftleg4.rotationPointX + (float)(xx);
        this.backleftleg4.rotationPointY = this.backleftleg4.rotationPointY - (float)(yy);
        this.backleftleg4.rotationPointZ = this.backleftleg4.rotationPointZ + (float)(zz);
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChalawan entity = (EntityPrehistoricFloraChalawan) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.35 + (((tickAnim - 20) / 10) * (-3.35-(-3.35)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.35 + (((tickAnim - 30) / 20) * (0-(-3.35)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 20) / 10) * (5.36059-(5.36059)));
            zz = 6.54547 + (((tickAnim - 20) / 10) * (6.54547-(6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = 5.36059 + (((tickAnim - 30) / 20) * (0-(5.36059)));
            zz = 6.54547 + (((tickAnim - 30) / 20) * (0-(6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = 14.10947 + (((tickAnim - 20) / 10) * (14.10947-(14.10947)));
            zz = -8.11649 + (((tickAnim - 20) / 10) * (-8.11649-(-8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = 14.10947 + (((tickAnim - 30) / 20) * (0-(14.10947)));
            zz = -8.11649 + (((tickAnim - 30) / 20) * (0-(-8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.05552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.05552 + (((tickAnim - 20) / 10) * (-9.05552-(-9.05552)));
            yy = 1.28004 + (((tickAnim - 20) / 10) * (1.28004-(1.28004)));
            zz = -6.73436 + (((tickAnim - 20) / 10) * (-6.73436-(-6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.05552 + (((tickAnim - 30) / 20) * (0-(-9.05552)));
            yy = 1.28004 + (((tickAnim - 30) / 20) * (0-(1.28004)));
            zz = -6.73436 + (((tickAnim - 30) / 20) * (0-(-6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 20) / 10) * (0.35-(0.35)));
            zz = 0.5 + (((tickAnim - 20) / 10) * (0.5-(0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 30) / 20) * (0-(0.35)));
            zz = 0.5 + (((tickAnim - 30) / 20) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.60841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.36059-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-6.54547-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.60841 + (((tickAnim - 20) / 10) * (-25.60841-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 20) / 10) * (-5.36059-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 20) / 10) * (-6.54547-(-6.54547)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.60841 + (((tickAnim - 30) / 20) * (0-(-25.60841)));
            yy = -5.36059 + (((tickAnim - 30) / 20) * (0-(-5.36059)));
            zz = -6.54547 + (((tickAnim - 30) / 20) * (0-(-6.54547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (29.54949-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-14.10947-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (8.11649-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29.54949 + (((tickAnim - 20) / 10) * (29.54949-(29.54949)));
            yy = -14.10947 + (((tickAnim - 20) / 10) * (-14.10947-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 20) / 10) * (8.11649-(8.11649)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 29.54949 + (((tickAnim - 30) / 20) * (0-(29.54949)));
            yy = -14.10947 + (((tickAnim - 30) / 20) * (0-(-14.10947)));
            zz = 8.11649 + (((tickAnim - 30) / 20) * (0-(8.11649)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.05552-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.28004-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (6.73436-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.05552 + (((tickAnim - 20) / 10) * (-9.05552-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 20) / 10) * (-1.28004-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 20) / 10) * (6.73436-(6.73436)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.05552 + (((tickAnim - 30) / 20) * (0-(-9.05552)));
            yy = -1.28004 + (((tickAnim - 30) / 20) * (0-(-1.28004)));
            zz = 6.73436 + (((tickAnim - 30) / 20) * (0-(6.73436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.35 + (((tickAnim - 20) / 10) * (0.35-(0.35)));
            zz = 0.5 + (((tickAnim - 20) / 10) * (0.5-(0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.35 + (((tickAnim - 30) / 20) * (0-(0.35)));
            zz = 0.5 + (((tickAnim - 30) / 20) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -28.75 + (((tickAnim - 20) / 10) * (-28.75-(-28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -28.75 + (((tickAnim - 30) / 20) * (0-(-28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.35 + (((tickAnim - 20) / 10) * (1.35-(1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.35 + (((tickAnim - 30) / 20) * (0-(1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-30.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -30.25 + (((tickAnim - 20) / 10) * (-30.25-(-30.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -30.25 + (((tickAnim - 30) / 20) * (0-(-30.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.175 + (((tickAnim - 20) / 10) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 20) / 10) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.175 + (((tickAnim - 30) / 20) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.275 + (((tickAnim - 30) / 20) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 20) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 30) / 20) * (0-(9.25)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.5 + (((tickAnim - 20) / 10) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 30) / 20) * (0-(0.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 20) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.5 + (((tickAnim - 20) / 10) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 30) / 20) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 28.75 + (((tickAnim - 20) / 10) * (28.75-(28.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 28.75 + (((tickAnim - 30) / 20) * (0-(28.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.35 + (((tickAnim - 20) / 10) * (-1.35-(-1.35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.35 + (((tickAnim - 30) / 20) * (0-(-1.35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (30.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 30.25 + (((tickAnim - 20) / 10) * (30.25-(30.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 30.25 + (((tickAnim - 30) / 20) * (0-(30.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.275-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.175 + (((tickAnim - 20) / 10) * (-0.175-(-0.175)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 20) / 10) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.175 + (((tickAnim - 30) / 20) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.275 + (((tickAnim - 30) / 20) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraChalawan e = (EntityPrehistoricFloraChalawan) entity;
        animator.update(entity);


    }
}
