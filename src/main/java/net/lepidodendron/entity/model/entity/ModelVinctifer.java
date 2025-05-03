package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurichthysMarine;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelVinctifer extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer martillichthys;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer maxilla;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer maxilla2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer lower_jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pectoral_fin;
    private final AdvancedModelRenderer pectoral_fin2;
    private final AdvancedModelRenderer pelvic_fin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer pelvic_fin2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body_2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer anal_fin;
    private final AdvancedModelRenderer cube_r27;

    private ModelAnimator animator;

    public ModelVinctifer() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.martillichthys = new AdvancedModelRenderer(this);
        this.martillichthys.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -3.5F, -18.0F);
        this.martillichthys.addChild(head);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 31, 13, -0.2F, -1.85F, 4.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 31, 13, -1.8F, -1.85F, 4.75F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 30, -1.0F, -1.5F, -1.0F, 1, 1, 11, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 43, -1.5F, -2.475F, 6.025F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 43, -1.5F, -0.5F, 7.0F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 30, -2.0F, -2.0F, 7.0F, 3, 3, 3, -0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -2.0F, 7.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1004F, -0.2007F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 53, 0.0F, 0.0F, -5.0F, 1, 1, 5, -0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -2.0F, 7.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2007F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 43, 50, 0.0F, 0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -2.0F, 7.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1004F, 0.2007F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 53, -1.0F, 0.0F, -5.0F, 1, 1, 5, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, -2.0F, 7.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2007F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 50, -1.0F, 0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.5F, 7.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1222F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 11, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.5F, 6.0401F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2531F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 37, -0.5F, 0.02F, -4.0059F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -3.0F, 10.0059F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 50, -1.0F, 0.0F, -4.0059F, 2, 2, 4, -0.002F, false));

        this.maxilla = new AdvancedModelRenderer(this);
        this.maxilla.setRotationPoint(0.1F, -0.5F, 3.0F);
        this.head.addChild(maxilla);
        this.setRotateAngle(maxilla, 0.0F, 0.1963F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.maxilla.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 54, -0.025F, -0.9F, 0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.maxilla.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5673F, 0.0184F, -0.0117F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 57, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.maxilla2 = new AdvancedModelRenderer(this);
        this.maxilla2.setRotationPoint(-1.1F, -0.5F, 3.0F);
        this.head.addChild(maxilla2);
        this.setRotateAngle(maxilla2, 0.0F, -0.1963F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.maxilla2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 54, 0.025F, -0.9F, 0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.maxilla2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5673F, -0.0184F, 0.0117F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 57, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.lower_jaw = new AdvancedModelRenderer(this);
        this.lower_jaw.setRotationPoint(-0.5F, -0.5F, 7.0F);
        this.head.addChild(lower_jaw);
        this.setRotateAngle(lower_jaw, 0.0F, 0.0F, 0.0F);
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 54, 22, -1.0F, -0.5008F, -1.9363F, 2, 2, 2, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 41, 57, -0.5F, -0.5008F, -3.9363F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9264F, -5.2704F);
        this.lower_jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2967F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 57, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.4992F, -1.9363F);
        this.lower_jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.384F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 0, -0.5F, -1.0F, -4.0F, 1, 1, 4, -0.004F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 1.4992F, -1.9363F);
        this.lower_jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2618F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 55, 59, 0.0F, -2.0F, -2.0F, 1, 1, 2, -0.002F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.4992F, -1.9363F);
        this.lower_jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2531F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 55, 0.0F, -2.0F, 0.0F, 2, 2, 2, -0.002F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 1.4992F, -1.9363F);
        this.lower_jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2531F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 55, -2.0F, -2.0F, 0.0F, 2, 2, 2, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 1.4992F, -1.9363F);
        this.lower_jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.2618F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 55, 59, -1.0F, -2.0F, -2.0F, 1, 1, 2, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.lower_jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2531F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 50, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.002F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -1.0F, 3.0F);
        this.head.addChild(body);


        this.pectoral_fin = new AdvancedModelRenderer(this);
        this.pectoral_fin.setRotationPoint(1.5F, 1.9957F, 7.069F);
        this.body.addChild(pectoral_fin);
        this.setRotateAngle(pectoral_fin, 0.3927F, 0.0F, -0.7854F);
        this.pectoral_fin.cubeList.add(new ModelBox(pectoral_fin, 36, 57, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.pectoral_fin2 = new AdvancedModelRenderer(this);
        this.pectoral_fin2.setRotationPoint(-1.5F, 1.9957F, 7.069F);
        this.body.addChild(pectoral_fin2);
        this.setRotateAngle(pectoral_fin2, 0.3927F, 0.0F, 0.7854F);
        this.pectoral_fin2.cubeList.add(new ModelBox(pectoral_fin2, 36, 57, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, true));

        this.pelvic_fin = new AdvancedModelRenderer(this);
        this.pelvic_fin.setRotationPoint(0.5F, 3.0443F, 17.1973F);
        this.body.addChild(pelvic_fin);
        this.setRotateAngle(pelvic_fin, 0.7854F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvic_fin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1699F, -0.5236F, -0.6155F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 60, 0.0884F, 0.0625F, -0.0625F, 0, 2, 1, 0.0F, false));

        this.pelvic_fin2 = new AdvancedModelRenderer(this);
        this.pelvic_fin2.setRotationPoint(-0.5F, 3.0443F, 17.1973F);
        this.body.addChild(pelvic_fin2);
        this.setRotateAngle(pelvic_fin2, 0.7854F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pelvic_fin2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1699F, 0.5236F, 0.6155F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 60, -0.0884F, 0.0625F, -0.0625F, 0, 2, 1, 0.0F, true));

        this.body_2 = new AdvancedModelRenderer(this);
        this.body_2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body.addChild(body_2);
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 0, -1.5F, -1.0F, 0.0F, 3, 3, 12, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 43, -1.0F, 2.0F, 3.0F, 2, 1, 8, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 16, -1.0F, -2.0F, 0.0F, 2, 1, 12, 0.002F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 1.5F, 3.0F);
        this.body_2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 6, -1.5F, 0.4986F, -2.9346F, 2, 1, 3, 0.002F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 1.0F, 15.0F);
        this.body_2.addChild(tail);


        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.5F, -0.5167F, -3.2719F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 35, -1.0F, -0.9833F, 0.2719F, 2, 2, 5, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 2.3863F, 0.2789F);
        this.tail2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1265F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 21, -1.5F, -2.0155F, -1.0152F, 1, 2, 6, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -2.4833F, 0.2719F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1396F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 5, -1.5F, 0.0F, 0.0F, 1, 2, 5, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0006F, 5.2358F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 35, -1.0F, -0.9839F, 0.0361F, 2, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, -2.4839F, -4.9639F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1396F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 5, -1.5F, 0.0F, 5.0F, 1, 2, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 2.3858F, -4.9569F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1265F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 35, 22, -1.5F, -2.0155F, 4.9848F, 1, 2, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.8839F, 4.0361F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.8727F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 56, 43, 0.0F, -0.6807F, -2.7006F, 0, 3, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0161F, 5.0361F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 43, 0.0F, -3.5F, 1.0F, 0, 7, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 54, 16, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.anal_fin = new AdvancedModelRenderer(this);
        this.anal_fin.setRotationPoint(0.5F, 1.6917F, 5.6969F);
        this.tail2.addChild(anal_fin);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -1.425F, -1.175F);
        this.anal_fin.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.9599F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 13, 53, -0.5F, 1.7777F, -0.4877F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.martillichthys.render(f5 );
    }
    public void renderStaticWall(float f) {
        this.martillichthys.rotateAngleY = (float) Math.toRadians(90);
        this.martillichthys.offsetX = -0.06F;
        this.martillichthys.offsetY = -0.2F;
        this.martillichthys.offsetZ = 0.07F;
        this.martillichthys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.martillichthys.offsetX = 0.01F;
        this.martillichthys.offsetY = -0.3F;
        this.martillichthys.offsetZ = -0.08F;
        this.martillichthys.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.martillichthys.offsetY = -1.0F;
        this.martillichthys.offsetX = 0.2F;
        this.martillichthys.rotateAngleY = (float)Math.toRadians(130);
        this.martillichthys.rotateAngleX = (float)Math.toRadians(-6);
        this.martillichthys.rotateAngleZ = (float)Math.toRadians(-2);
        this.martillichthys.scaleChildren = true;
        float scaler = 1.85F;
        this.martillichthys.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(martillichthys, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(lower_jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.martillichthys.render(f);
        //Reset rotations, positions and sizing:
        this.martillichthys.setScale(1.0F, 1.0F, 1.0F);
        this.martillichthys.scaleChildren = false;
        resetToDefaultPose();

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

        AdvancedModelRenderer[] fishTail = {this.tail2, this.tail3, this.tail4};
        float speed = 0.25F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.24F, -1, f2, 1);
            this.swing(martillichthys, speed, 0.2F, true, 0, 0, f2, 1);
            //this.walk(lowerjaw, (float) (speed * 0.75), (float)Math.toRadians(10D), true, 0, 0, f2, 1);
            this.walk(pectoral_fin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoral_fin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoral_fin2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoral_fin2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvic_fin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvic_fin2, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.martillichthys.rotateAngleZ = (float) Math.toRadians(90);
                if (e instanceof EntityPrehistoricFloraSaurichthysMarine) {
                    this.martillichthys.offsetY = 1.2F;
                }
                else {
                    this.martillichthys.offsetY = 0;
                }
                this.bob(martillichthys, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.upperjaw, 0,0,-0.5F);
        animator.rotate(this.lower_jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

