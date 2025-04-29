package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRomerodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer teeth;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelRomerodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.8F, 9.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, -2.5F, -5.25F, -7.0F, 5, 5, 7, 0.001F, false));
        this.root.cubeList.add(new ModelBox(root, 13, 13, -2.0F, -1.05F, -7.0F, 4, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -5.45F, -3.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 37, 0.5F, -2.375F, -3.525F, 0, 3, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -5.45F, -3.0F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 27, -1.5F, 0.025F, -3.525F, 4, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.6905F, -0.5179F);
        this.root.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 25, 0, -2.0F, -2.0595F, 0.0179F, 4, 4, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 2.6405F, 0.0179F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 34, -0.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -2.5595F, 0.0179F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 32, -0.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0314F, 4.6896F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 39, -1.5F, -1.5281F, 0.0783F, 3, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2781F, 0.0783F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 42, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 2.3719F, 0.0783F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 13, -0.5F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0257F, 3.5557F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 15, -1.0F, -1.0024F, 0.0226F, 2, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.7024F, 0.0226F);
        this.tail3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 47, -0.5F, 0.025F, 0.075F, 1, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.9976F, 0.0226F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1527F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 47, -1.0F, -1.3F, 0.1F, 1, 1, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0135F, 3.7625F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 47, -0.5F, -0.4889F, 0.0101F, 1, 1, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 0, -1.5F, 0.0111F, -0.4899F, 3, 0, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0889F, 0.0101F);
        this.tail4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2967F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 47, -0.5F, -0.025F, 0.175F, 1, 1, 2, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.0111F, -0.2399F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 47, -1.0F, -0.9F, 0.375F, 1, 1, 2, -0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0111F, 4.0101F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 14, 0.0F, -6.0F, 0.0F, 0, 12, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 13, 22, -2.0F, -10.25F, -10.5F, 4, 5, 5, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 29, 35, -1.5F, -6.05F, -10.5F, 3, 1, 5, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -10.6F, -6.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1134F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 41, -0.5F, -0.175F, -4.5F, 3, 1, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(-1.5F, -5.2F, -9.0F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.829F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 27, 22, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(1.5F, -5.2F, -9.0F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 0.829F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 27, 22, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.025F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 29, 10, -1.5F, -9.0F, -15.0F, 3, 3, 5, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -8.4751F, -17.2663F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3229F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 47, 33, -0.5F, -0.1041F, -3.9915F, 1, 1, 4, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -9.1751F, -15.3663F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2967F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 33, -0.25F, 0.8038F, -1.1164F, 1, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 33, -1.75F, 0.8038F, -1.1164F, 1, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 44, -1.5F, 0.0038F, -2.0164F, 2, 2, 2, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -10.25F, -10.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 5, -0.5F, 0.0F, -5.0F, 2, 2, 5, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -5.25F, -10.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 10, -0.5F, -0.8F, -4.525F, 3, 1, 1, -0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 27, -0.5F, -0.8F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.0F, -15.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 32, -0.5F, -2.0F, -3.0F, 1, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.2F, -0.9F, -5.0F, 0, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.2F, -0.9F, -5.0F, 0, 1, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 22, -0.5F, -1.0F, -5.0F, 1, 1, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 0, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2F, -6.1674F, -16.985F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1392F, 0.346F, -0.0475F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 13, 0.0F, -0.9932F, -0.0102F, 0, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, -6.1674F, -16.985F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1392F, -0.346F, 0.0475F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 13, 0.0F, -0.9932F, -0.0102F, 0, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -6.0754F, -14.9504F);
        this.head.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.7943F, -0.0548F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 46, -0.5F, -0.9904F, -5.2488F, 1, 1, 4, -0.001F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 35, -1.0F, -0.9904F, -2.0238F, 2, 1, 2, -0.002F, false));

        this.teeth = new AdvancedModelRenderer(this);
        this.teeth.setRotationPoint(0.5F, -0.6901F, -4.0068F);
        this.jaw.addChild(teeth);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.teeth.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2269F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 13, 0.0F, -0.525F, -0.95F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.1043F, 1.7256F);
        this.teeth.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1443F, 0.4323F, -0.0608F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 22, 0.0F, -0.0102F, -0.0068F, 0, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.1043F, 1.7256F);
        this.teeth.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1443F, -0.4323F, 0.0608F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 22, 0.0F, -0.0102F, -0.0068F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.01F, 0.3829F, 1.4299F);
        this.teeth.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.01F, -0.325F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5231F, -0.0947F);
        this.teeth.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5149F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 0, 0.01F, 0.006F, 0.0246F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.6F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail5, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 0.829F);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(cube_r9, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1527F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.5149F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1443F, -0.4323F, 0.0608F);
        this.setRotateAngle(cube_r21, -0.1443F, 0.4323F, -0.0608F);
        this.setRotateAngle(cube_r20, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.1392F, -0.346F, 0.0475F);
        this.setRotateAngle(cube_r17, -0.1392F, 0.346F, -0.0475F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetZ = -0.25F;
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail5, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.2096F, -0.1991F, 0.1573F);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, 0.829F);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(cube_r9, -0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1527F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.5149F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, -0.1443F, -0.4323F, 0.0608F);
        this.setRotateAngle(cube_r21, -0.1443F, 0.4323F, -0.0608F);
        this.setRotateAngle(cube_r20, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.1392F, -0.346F, 0.0475F);
        this.setRotateAngle(cube_r17, -0.1392F, 0.346F, -0.0475F);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.2967F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.root.offsetZ = -0.07F;
        this.root.offsetY = -0.3F;
        this.root.offsetX = 0.005F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.root.offsetY = -0.5F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.05F;
            this.bob(root, -speed * 3.9F, 1.2F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.6F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.6F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

