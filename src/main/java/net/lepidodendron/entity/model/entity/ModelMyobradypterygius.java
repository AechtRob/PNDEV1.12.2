package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMyobradypterygius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelMyobradypterygius extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoral_fin;
    private final AdvancedModelRenderer pectoral_fin2;
    private final AdvancedModelRenderer body_2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body_3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pelvic_fin;
    private final AdvancedModelRenderer pelvic_fin2;
    private final AdvancedModelRenderer body_5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body_6;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;


    public ModelMyobradypterygius() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -8.65F, -18.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 15, 82, -1.0F, -0.35F, -15.5F, 2, 1, 10, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 113, -1.5F, -0.35F, -9.3F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 101, 29, 0.75F, 0.15F, -15.25F, 0, 1, 10, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 101, 29, -0.75F, 0.15F, -15.25F, 0, 1, 10, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 104, 82, -2.0F, -1.35F, -6.3F, 4, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 75, -2.0F, -2.35F, -2.3F, 4, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.65F, -15.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 91, -1.0F, -1.0F, 0.0F, 2, 1, 9, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.0347F, -0.3191F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 105, 41, -2.0F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.3442F, -3.9444F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 105, 18, -2.0F, 0.0F, -4.0F, 3, 1, 5, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.05F, -0.95F, -2.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 113, -1.25F, -1.0F, -2.0F, 1, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 49, -1.275F, -0.5F, -1.5F, 1, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 49, 2.375F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 113, 2.35F, -1.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.65F, -0.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 75, 91, -1.0F, 0.0F, -15.0F, 2, 1, 10, 0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 105, 48, -1.5F, 0.0F, -8.8F, 3, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 104, 74, -2.0F, 0.0F, -5.8F, 4, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 108, 78, -2.0F, -1.0F, -1.8F, 4, 1, 2, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 101, 0.7F, -0.5F, -14.75F, 0, 1, 10, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 40, 101, -0.7F, -0.5F, -14.75F, 0, 1, 10, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.95F, -3.6478F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 80, 103, -1.5F, -3.0399F, -1.004F, 3, 4, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.288F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 97, -1.5F, -1.0399F, 0.096F, 3, 1, 3, -0.004F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, -0.85F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 78, 0, -3.5F, -4.0F, 0.35F, 7, 8, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 39, 18, -5.5F, -5.6F, 5.35F, 11, 12, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.0F, 0.35F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4843F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 37, -3.0F, -3.0F, 0.0F, 6, 3, 12, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -5.7053F, 5.0555F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2007F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 103, 0, -3.0F, 0.0F, 0.0F, 5, 3, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -4.0158F, 0.3496F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3447F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 104, -3.0F, 0.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.pectoral_fin = new AdvancedModelRenderer(this);
        this.pectoral_fin.setRotationPoint(5.0F, 2.6457F, 6.919F);
        this.body.addChild(pectoral_fin);
        this.setRotateAngle(pectoral_fin, 0.0F, 0.0F, -0.3927F);
        this.pectoral_fin.cubeList.add(new ModelBox(pectoral_fin, 43, 113, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));
        this.pectoral_fin.cubeList.add(new ModelBox(pectoral_fin, 0, 75, 0.0F, 2.0F, -3.25F, 0, 18, 7, 0.0F, false));

        this.pectoral_fin2 = new AdvancedModelRenderer(this);
        this.pectoral_fin2.setRotationPoint(-5.0F, 2.6457F, 6.919F);
        this.body.addChild(pectoral_fin2);
        this.setRotateAngle(pectoral_fin2, 0.0F, 0.0F, 0.3927F);
        this.pectoral_fin2.cubeList.add(new ModelBox(pectoral_fin2, 43, 113, -0.5F, 0.0F, -1.5F, 1, 4, 3, 0.0F, true));
        this.pectoral_fin2.cubeList.add(new ModelBox(pectoral_fin2, 0, 75, 0.0F, 2.0F, -3.25F, 0, 18, 7, 0.0F, true));

        this.body_2 = new AdvancedModelRenderer(this);
        this.body_2.setRotationPoint(0.0F, 0.15F, 10.9F);
        this.body.addChild(body_2);
        this.body_2.cubeList.add(new ModelBox(body_2, 76, 43, -4.5F, 5.6059F, 0.0255F, 9, 4, 5, -0.004F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 15, 94, -4.5F, 5.019F, 5.882F, 9, 6, 3, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 103, 10, -4.0F, 3.1125F, 12.8674F, 8, 4, 3, -0.004F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 21, -6.0F, -5.5F, 6.0F, 12, 13, 7, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 31, 67, -5.5F, -4.75F, 13.0F, 11, 11, 3, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 40, 82, 0.0F, -13.5807F, 6.1994F, 0, 10, 8, 0.0F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 0, 0, -6.5F, -5.925F, 0.025F, 13, 14, 6, 0.002F, false));
        this.body_2.cubeList.add(new ModelBox(body_2, 102, 66, -4.0F, -7.075F, 0.025F, 8, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.917F, 24.8381F);
        this.body_2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 0, -3.5F, -0.0274F, -21.0883F, 7, 5, 12, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 11.019F, 8.882F);
        this.body_2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5105F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 53, -4.5F, -5.0F, 0.0F, 8, 5, 8, -0.002F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 9.6095F, 0.0412F);
        this.body_2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2356F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 74, 18, -4.5F, -3.9978F, 0.0062F, 9, 4, 6, -0.002F, false));

        this.body_3 = new AdvancedModelRenderer(this);
        this.body_3.setRotationPoint(0.0F, -0.1F, 15.0F);
        this.body_2.addChild(body_3);
        this.body_3.cubeList.add(new ModelBox(body_3, 93, 53, -3.0F, -3.4417F, 5.0495F, 6, 7, 5, -0.002F, false));
        this.body_3.cubeList.add(new ModelBox(body_3, 64, 53, -4.5F, -4.0167F, 0.4995F, 9, 9, 5, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -5.1547F, 0.9349F);
        this.body_3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1484F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 76, 29, -2.0F, -0.0024F, -0.9883F, 4, 5, 8, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.2625F, 0.7424F);
        this.body_3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3796F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 59, -2.5F, -5.0F, 0.0F, 5, 5, 10, -0.002F, false));

        this.pelvic_fin = new AdvancedModelRenderer(this);
        this.pelvic_fin.setRotationPoint(4.1F, 1.6F, 4.45F);
        this.body_3.addChild(pelvic_fin);
        this.setRotateAngle(pelvic_fin, 0.0F, 0.0F, -0.3927F);
        this.pelvic_fin.cubeList.add(new ModelBox(pelvic_fin, 31, 42, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, false));
        this.pelvic_fin.cubeList.add(new ModelBox(pelvic_fin, 19, 112, 0.0F, 2.0F, -1.5F, 0, 9, 5, 0.0F, false));

        this.pelvic_fin2 = new AdvancedModelRenderer(this);
        this.pelvic_fin2.setRotationPoint(-4.1F, 1.6F, 4.45F);
        this.body_3.addChild(pelvic_fin2);
        this.setRotateAngle(pelvic_fin2, 0.0F, 0.0F, 0.3927F);
        this.pelvic_fin2.cubeList.add(new ModelBox(pelvic_fin2, 31, 42, -0.5F, 0.0F, -1.0F, 1, 4, 2, 0.0F, true));
        this.pelvic_fin2.cubeList.add(new ModelBox(pelvic_fin2, 19, 112, 0.0F, 2.0F, -1.5F, 0, 9, 5, 0.0F, true));

        this.body_5 = new AdvancedModelRenderer(this);
        this.body_5.setRotationPoint(0.0F, -0.4F, 8.0F);
        this.body_3.addChild(body_5);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 2.2116F, 10.3228F);
        this.body_5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 75, 68, -1.5F, -3.0024F, -8.9883F, 4, 3, 9, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -3.3253F, 1.823F);
        this.body_5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 42, -1.5F, -0.2274F, -2.0383F, 4, 5, 11, 0.0F, false));

        this.body_6 = new AdvancedModelRenderer(this);
        this.body_6.setRotationPoint(0.0F, -0.675F, 10.075F);
        this.body_5.addChild(body_6);
        this.body_6.cubeList.add(new ModelBox(body_6, 60, 68, 0.0F, -9.5F, 6.3F, 0, 21, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.5062F, 7.3795F);
        this.body_6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.192F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 100, 102, -1.0F, -3.0024F, -7.9883F, 2, 3, 8, -0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.3081F, 9.6334F);
        this.body_6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 61, 103, -1.0F, -0.0024F, -8.9883F, 2, 3, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 6.9964F, 8.2856F);
        this.body_6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.0036F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 114, -1.0F, -0.9614F, 0.0172F, 1, 1, 4, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.9F, 7.5F);
        this.body_6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.3526F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 104, -1.0F, -0.0614F, -0.0828F, 1, 1, 8, 0.0F, false));

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
        this.main.offsetY = -0.40F;
        this.main.offsetX = -0.06F;
        this.main.rotateAngleY = (float)Math.toRadians(240);
        this.main.rotateAngleX = (float)Math.toRadians(28);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
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
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.body_3, this.body_5, this.body_6};
        AdvancedModelRenderer[] upperBody = {this.head};
        ((EntityPrehistoricFloraMyobradypterygius)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.15F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.8F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.18F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {

            if (!ee.getIsFast()) {
                this.chainSwing(fishTail, speed * still, 0.35F * still, -3, f2, 0.5F * still);
            }
            else {
                this.chainSwing(fishTail, speed * still, 0.45F * still, -3, f2, 0.5F * still);
            }
            this.chainSwing(upperBody, speed * still, 0.15F, 0, f2, 0.5F *still);
        }
        else {
            //Dont swing if on land - it loooks dumb
            //this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoral_fin, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoral_fin, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);
        this.walk(pectoral_fin, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(pectoral_fin2, (float) (speed * 0.65), 0.4F, true, 0.8F, 0, f2, 0.5F);
        this.swing(pectoral_fin2, (float) (speed * 0.65), 0.2F, false, 0, 0, f2, 0.5F);
        this.walk(pectoral_fin2, (float) (speed * 0.65), 0.2F, true, 0, 0, f2, 0.5F);

        this.flap(pelvic_fin, (float) (speed * 0.65), 0.4F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvic_fin, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);
        this.walk(pelvic_fin, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        this.flap(pelvic_fin2, (float) (speed * 0.65), 0.4F, true, 1.8F, 0, f2, 0.5F);
        this.swing(pelvic_fin2, (float) (speed * 0.65), 0.2F, false, 1, 0, f2, 0.5F);
        this.walk(pelvic_fin2, (float) (speed * 0.65), 0.2F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.main.offsetY = 0.15F;
            this.bob(main, -speed * 1.8F, 0.02F, false, f2, 1);
            this.walk(jaw, (float) (speed * 1.8F), 0.15F, false, 1, 0, f2, 0);
            this.chainWave(fishTail, speed * 1.5F, 0.0025F, -0.1, f2, 0.4F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.01F, -0.25, f2, 0.2F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, -(float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

