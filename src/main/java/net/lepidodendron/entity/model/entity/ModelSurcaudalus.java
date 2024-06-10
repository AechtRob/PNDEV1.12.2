package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSurcaudalus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;

    private ModelAnimator animator;

    public ModelSurcaudalus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 21, 21, -2.0F, -8.75F, -1.0F, 4, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -9.5F, -1.0F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 30, -1.0F, 0.05F, -0.025F, 3, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -5.05F, -1.0F);
        this.root.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -1.0F, -0.5F, -0.05F, 3, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.95F, 2.5F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 11, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.0F, 0.0F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.0908F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.5F, 1.45F, -0.45F, 0, 4, 6, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 14, 0.0F, 0.45F, -0.45F, 1, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 1.5F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 8, -0.5F, -0.5F, -0.05F, 2, 1, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 1.5F, 0.5F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.3175F, 0.2351F, -0.6167F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 43, 0, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 1.5F, 0.5F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.3175F, -0.2351F, 0.6167F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 43, 0, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.125F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 36, -1.0F, -0.75F, 0.0F, 2, 2, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 42, -1.0F, -1.5F, 0.0F, 2, 1, 4, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 3.625F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 39, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.0F, 2.0F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.45F, -1.175F, -0.925F, 0, 3, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.05F, 3.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 14, 0, -0.5F, -0.5F, 0.0F, 1, 1, 9, -0.001F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -3.0F, 0.0F, 0, 7, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 21, -2.5F, -9.5F, -6.0F, 5, 5, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -9.5F, -5.5F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 34, -0.5F, -6.5F, 0.5F, 0, 7, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 0, -1.0F, -3.5F, -0.5F, 1, 4, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.body.addChild(body2);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -4.25F, -1.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.144F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 30, -2.5F, -3.25F, -4.0F, 3, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -9.5F, -1.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0916F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 0, -0.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.5F, -1.0F);
        this.body2.addChild(head);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 2.875F, -5.6F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 38, -0.5F, -0.1248F, 0.607F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 2.875F, -5.6F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 21, -0.5F, -1.9998F, -0.343F, 3, 2, 3, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 2.7951F, -7.5934F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 36, -0.5F, -1.0069F, -1.9981F, 2, 1, 2, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.5603F, -7.0807F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 0, -0.35F, -0.55F, -0.1F, 0, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 0, -0.375F, -0.825F, -0.725F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5603F, -7.0807F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 0, 0.375F, -0.825F, -0.725F, 0, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 0, 0.35F, -0.55F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.375F, -4.0F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 43, 27, -0.5F, 1.5676F, -3.4825F, 2, 1, 2, 0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.875F, -6.95F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2662F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 21, -0.5F, -0.0137F, -1.9904F, 2, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 21, -0.5F, -0.0137F, -2.5654F, 2, 1, 1, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.375F, -4.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1658F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 0, -2.525F, 0.4926F, -3.3075F, 1, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.375F, -4.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1658F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 0, 1.525F, 0.4926F, -3.3075F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 40, -0.5F, -0.0074F, -2.9825F, 3, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.9749F, -4.8429F);
        this.head.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.2499F, -1.0821F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 8, -0.5F, -0.0748F, 0.107F, 2, 1, 1, -0.002F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.3F, -0.5878F, -0.958F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 21, 0.0F, 0.1931F, -1.7272F, 0, 1, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.3F, -0.5878F, -0.958F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 21, 0.0F, 0.1931F, -1.7272F, 0, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.2381F, -0.9689F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 31, 43, -0.5F, -0.0568F, -1.9816F, 1, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5F, -5.5F, -3.0F);
        this.body2.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.4946F, 0.5148F, -0.7399F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 14, 0, 0.0F, -0.25F, -0.5F, 0, 5, 3, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5F, -5.5F, -3.0F);
        this.body2.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.4946F, -0.5148F, 0.7399F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 14, 0, 0.0F, -0.25F, -0.5F, 0, 5, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.8F, 0.0F, 0.0F);
        this.root.offsetZ = -0.92F;
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.03F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.root.offsetZ = -0.0F;
        this.root.offsetY = -0.06F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.4F;
        this.root.offsetX = -0.1F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 3.7F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.7F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, -0.5F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
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
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

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
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.walk(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.walk(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.walk(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);

        //this.flap(AnalFin, (float) (speed * 0.65), -0.28F, false, 0.4F, 0.1F, f2, 0.5F);
        //this.flap(DorsalFin, (float) (speed * 0.65), -0.18F, false, 0.4F, 0.05F, f2, 0.5F);

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(270);
            this.root.offsetY = -0.40F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Head, 0,0,-0.5F);
        //animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

