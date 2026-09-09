package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSelkirkia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSelkirkia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public ModelSelkirkia() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 25.8821F, 0.0F);
        setRotateAngle(tail, 0.0F, 0.0F, -1.5708F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 8, -0.5F, 0.0F, -0.497F, 1, 2, 1, 0.002F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.25F, -3.0F, -0.75F, 1, 3, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.75F, -3.0F, -0.75F, 1, 3, 1, 0.002F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.75F, -3.0F, -0.25F, 1, 3, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.25F, -3.0F, -0.25F, 1, 3, 1, 0.002F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.75F, -3.0F, -0.75F, 1, 3, 1, 0.006F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.25F, -3.0F, -0.75F, 1, 3, 1, 0.004F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.25F, -3.0F, -0.25F, 1, 3, 1, 0.006F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.75F, -3.0F, -0.25F, 1, 3, 1, 0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.8654F, -0.0022F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.75F, -1.0346F, -0.7478F, 1, 1, 1, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.25F, -1.0346F, -0.7478F, 1, 1, 1, 0.048F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.25F, -1.0346F, -0.2478F, 1, 1, 1, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.75F, -1.0346F, -0.2478F, 1, 1, 1, 0.048F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -1.5846F, -0.4978F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 1.1781F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -1.1781F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.25F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -3.1416F, 0.0F, -2.7489F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.7761F, -0.7119F, -2.6117F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3655F, -0.7119F, -0.5299F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3655F, 0.7119F, -0.5299F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7071F, -0.4346F, -0.7049F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.7761F, 0.7119F, -2.6117F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -0.6F, -0.6F, 0.0F, 1, 1, 0, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tail.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.tail.offsetY = -0.2F;
        this.tail.offsetX = 0.1F;
        this.tail.offsetZ = 2.0F;
        this.tail.rotateAngleY = (float)Math.toRadians(120);
        this.tail.rotateAngleX = (float)Math.toRadians(0);
        this.tail.rotateAngleZ = (float)Math.toRadians(0);
        this.tail.scaleChildren = true;
        float scaler = 0.4F;
        this.tail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(tail, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.tail.render(f);
        //Reset rotations, positions and sizing:
        this.tail.setScale(1.0F, 1.0F, 1.0F);
        this.tail.scaleChildren = false;
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
        float offsetV = 1.0F - 1.15F;
        this.tail.offsetY = offsetV;
        float rotX = (float) Math.toRadians(86);
        this.tail.rotateAngleX = rotX;
        this.tail.offsetZ = 0.2F;

        EntityPrehistoricFloraSelkirkia ee = (EntityPrehistoricFloraSelkirkia) e;

        float speedmodifier = 1;
        float swaymodifier = 1;
        float buried = 1;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fullBody = {this.body2, this.body1, this.head};
        AdvancedModelRenderer[] headBody = {this.body2, this.body1, this.head};

        float speed = 0.4F;
        float taildegree = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        speed = 0.15F * speedmodifier;
        taildegree = 0.22F;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.tail.offsetY = offsetV + -1.0F + 4.5F;
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98);
                this.tail.offsetZ = 0;
                swaymodifier = 0;
                buried = 0;
                //Do some fully-buried wiggle animatins:
                this.chainWave(headBody, speed, -0.55F, 2.5, f2, 0.8F);
                this.chainSwing(headBody, speed, -0.55F, -2.5, f2, 0.8F);
            }
            else {
                this.tail.offsetY = offsetV + (1.5F * (float)((double)ee.getBuriedTick()/60D));
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98 * ((double)ee.getBuriedTick()/60D));
                this.tail.offsetZ = 0.2F - (float) (0.2 * ((double)ee.getBuriedTick()/60D));
                buried = 0;
            }
        }
        else {
            this.tail.offsetY = offsetV;
            this.tail.rotateAngleX = rotX - (float) Math.toRadians(8);

            this.chainSwing(fullBody, speed, taildegree * buried * 0.7F, -2, f2, 1);
            this.chainWave(headBody, speed, -0.05F * buried * 0.15F, 1, f2, 1);
            this.chainSwing(headBody, speed, -taildegree * buried * 0.7F, -1, f2, 1);

            this.tail.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
            this.body2.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
        }

        float bobber = 2.5F;

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.tail.offsetY =- 0.05F - 0.76F - 2.0F;
            bobber = 1.0F;
            this.chainWave(fullBody, speed, 0.2F * 0.2F, -2, f2, 1 * 0.5F);
        }
        else {
            this.chainWave(fullBody, speed, 0.05F * buried, -3, f2, 1);
        }
        this.bob(tail, -speed, bobber, false, f2, 0.2F);

    }
}
