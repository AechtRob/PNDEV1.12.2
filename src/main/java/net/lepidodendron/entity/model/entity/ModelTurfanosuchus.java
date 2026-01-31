package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraXilousuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTurfanosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftArm;
    private final AdvancedModelRenderer frontLeftArm2;
    private final AdvancedModelRenderer frontLeftArm3;
    private final AdvancedModelRenderer frontRightArm;
    private final AdvancedModelRenderer frontRightArm2;
    private final AdvancedModelRenderer frontRightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer sail3;
    private final AdvancedModelRenderer sail2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer sail;

    private ModelAnimator animator;

    public ModelTurfanosuchus() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 14.5081F, -0.522F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -0.2581F, -0.478F, 4, 4, 5, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.4419F, -0.478F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0742F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 13, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.01F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.95F, 0.9127F, 2.6164F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2182F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 15, 34, -0.7F, -0.5F, -1.5F, 2, 5, 3, 0.01F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.8F, 4.5F, -1.5F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.7025F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 39, 34, -1.5F, 0.0F, 0.0F, 2, 5, 2, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 4.4891F, 0.5023F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -2.0508F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 9, 43, -2.0F, -1.0F, 0.0F, 3, 4, 1, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.95F, 0.9127F, 2.6164F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2182F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 15, 34, -1.3F, -0.5F, -1.5F, 2, 5, 3, 0.01F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.8F, 4.5F, -1.5F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.7025F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 39, 34, -0.5F, 0.0F, 0.0F, 2, 5, 2, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 4.4891F, 0.5023F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -2.0508F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 9, 43, -1.0F, -1.0F, 0.0F, 3, 4, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2581F, 0.522F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 10, -2.0F, 0.0F, -5.0F, 4, 4, 5, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 4.7F, -1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 28, -2.0F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.75F, -4.5F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 27, -1.5F, -0.75F, -3.0F, 3, 3, 3, 0.0F, false));

        this.frontLeftArm = new AdvancedModelRenderer(this);
        this.frontLeftArm.setRotationPoint(1.5F, 1.5556F, -1.8712F);
        this.body2.addChild(frontLeftArm);
        this.setRotateAngle(frontLeftArm, 0.7459F, 0.274F, -0.2849F);
        this.frontLeftArm.cubeList.add(new ModelBox(frontLeftArm, 18, 43, -0.5F, -0.5F, -1.0F, 1, 4, 2, 0.01F, false));

        this.frontLeftArm2 = new AdvancedModelRenderer(this);
        this.frontLeftArm2.setRotationPoint(0.0F, 2.8467F, 0.2706F);
        this.frontLeftArm.addChild(frontLeftArm2);
        this.setRotateAngle(frontLeftArm2, -1.1781F, 0.0F, 0.0F);
        this.frontLeftArm2.cubeList.add(new ModelBox(frontLeftArm2, 9, 36, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));
        this.frontLeftArm2.cubeList.add(new ModelBox(frontLeftArm2, 25, 47, -0.5F, 0.0F, -0.3F, 1, 3, 1, -0.003F, false));

        this.frontLeftArm3 = new AdvancedModelRenderer(this);
        this.frontLeftArm3.setRotationPoint(0.5F, 3.0F, -0.15F);
        this.frontLeftArm2.addChild(frontLeftArm3);
        this.setRotateAngle(frontLeftArm3, 0.0F, 0.0F, 0.3491F);
        this.frontLeftArm3.cubeList.add(new ModelBox(frontLeftArm3, 45, 0, -1.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.frontRightArm = new AdvancedModelRenderer(this);
        this.frontRightArm.setRotationPoint(-1.5F, 1.5556F, -1.8712F);
        this.body2.addChild(frontRightArm);
        this.setRotateAngle(frontRightArm, 0.7459F, -0.274F, 0.2849F);
        this.frontRightArm.cubeList.add(new ModelBox(frontRightArm, 18, 43, -0.5F, -0.5F, -1.0F, 1, 4, 2, 0.01F, true));

        this.frontRightArm2 = new AdvancedModelRenderer(this);
        this.frontRightArm2.setRotationPoint(0.0F, 2.8467F, 0.2706F);
        this.frontRightArm.addChild(frontRightArm2);
        this.setRotateAngle(frontRightArm2, -1.1781F, 0.0F, 0.0F);
        this.frontRightArm2.cubeList.add(new ModelBox(frontRightArm2, 9, 36, -0.5F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));
        this.frontRightArm2.cubeList.add(new ModelBox(frontRightArm2, 25, 47, -0.5F, 0.0F, -0.3F, 1, 3, 1, -0.003F, true));

        this.frontRightArm3 = new AdvancedModelRenderer(this);
        this.frontRightArm3.setRotationPoint(-0.5F, 3.0F, -0.15F);
        this.frontRightArm2.addChild(frontRightArm3);
        this.setRotateAngle(frontRightArm3, 0.0F, 0.0F, -0.3491F);
        this.frontRightArm3.cubeList.add(new ModelBox(frontRightArm3, 45, 0, 0.0F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -0.1F, -2.65F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 36, 13, -0.5F, -0.5F, -3.0F, 2, 2, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5182F, -0.0521F, 0.0062F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 42, -0.5F, -0.85F, -0.45F, 1, 2, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5064F, -2.9231F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 26, 41, -0.5F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0583F, 1.423F, -3.5954F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0764F, -0.0227F, 0.0444F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 47, 0.0F, -0.65F, 0.075F, 0, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.9417F, 1.423F, -3.5954F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0764F, 0.0227F, -0.0444F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 47, 0.0F, -0.65F, 0.075F, 0, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.5F, -3.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0829F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 34, -1.0F, -1.075F, 0.15F, 1, 1, 1, -0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 23, -1.5F, -1.075F, 1.1F, 2, 1, 2, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 0.4046F, -2.9726F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1789F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 46, -1.0F, 0.05F, -0.975F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.15F, 0.7881F, -1.1577F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 47, -0.4F, -0.475F, -0.5F, 1, 1, 1, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.15F, 0.7881F, -1.1577F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 47, -0.6F, -0.475F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1353F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 19, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.35F, 0.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 27, -0.5F, -0.375F, -1.9F, 2, 1, 2, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 31, -0.5F, -1.075F, -1.4F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 13, 0.0F, -0.375F, -3.55F, 1, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 37, 0.9F, -0.625F, -3.45F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 37, 0.1F, -0.625F, -3.45F, 0, 1, 1, 0.0F, true));

        this.sail3 = new AdvancedModelRenderer(this);
        this.sail3.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body2.addChild(sail3);
        this.sail3.cubeList.add(new ModelBox(sail3, 37, 42, 0.0F, -5.0F, -3.0F, 0, 5, 3, 0.0F, false));

        this.sail2 = new AdvancedModelRenderer(this);
        this.sail2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body.addChild(sail2);
        this.sail2.cubeList.add(new ModelBox(sail2, 19, 0, 0.025F, -6.0F, -6.0F, 0, 6, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.2145F, 4.0201F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 20, -1.5F, 0.0F, 0.0F, 4, 4, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -0.2014F, 1.3405F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 43, 7, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.025F, 2.3F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 20, -1.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 7, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, -0.5F, 0.0F, 0.0F, 2, 2, 5, -0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.675F, 0.0F);
        this.tail3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1353F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 0, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 34, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 20, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.006F, false));

        this.sail = new AdvancedModelRenderer(this);
        this.sail.setRotationPoint(0.0F, -0.2581F, 1.522F);
        this.main.addChild(sail);
        this.sail.cubeList.add(new ModelBox(sail, 0, 36, 0.0F, -5.0F, -1.0F, 0, 5, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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

        EntityPrehistoricFloraXilousuchus EntityMegalosaurus = (EntityPrehistoricFloraXilousuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        AdvancedModelRenderer[] ArmL = {this.frontLeftArm, this.frontLeftArm2, this.frontLeftArm3};
        AdvancedModelRenderer[] ArmR = {this.frontRightArm, this.frontRightArm2, this.frontRightArm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.frontLeftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.frontRightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.frontLeftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.frontRightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraXilousuchus entity = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraXilousuchus ee = (EntityPrehistoricFloraXilousuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
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
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraXilousuchus e = (EntityPrehistoricFloraXilousuchus) entity;

    }
}
