package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPriapulites;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPriapulites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;

    public ModelPriapulites() {
        this.textureWidth = 20;
        this.textureHeight = 15;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.setRotateAngle(tail, -1.5708F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 11, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.tail.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 6, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 9, 4, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.001F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 7, 9, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 8, 0, -0.5F, -0.5F, -3.25F, 1, 1, 1, 0.1F, false));
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
        this.tail.offsetZ = -0.04F;
        this.tail.offsetY = -0.43F;
        this.tail.render(0.011F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.tail.offsetY = -6.2F;
        this.tail.offsetX = -2.4F;
        this.tail.offsetZ = 2.0F;
        this.tail.rotateAngleY = (float)Math.toRadians(120);
        this.tail.rotateAngleX = (float)Math.toRadians(1);
        this.tail.rotateAngleZ = (float)Math.toRadians(0);
        this.tail.scaleChildren = true;
        float scaler = 4.2F;
        this.tail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(tail, 3.2F, 3.8F, -0.2F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.0F);

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
        float offsetV = 1.0F - 1.2F;
        this.tail.offsetY = offsetV;
        float rotX = (float) Math.toRadians(6);
        this.tail.rotateAngleX = rotX;
        this.tail.offsetZ = 0.2F;

        EntityPrehistoricFloraPriapulites ee = (EntityPrehistoricFloraPriapulites) e;

        float speedmodifier = 1;
        float swaymodifier = 1;
        float buried = 1;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fullBody = {this.tail, this.body3, this.body2, this.body1, this.head};
        AdvancedModelRenderer[] headBody = {this.body3, this.body2, this.body1, this.head};

        float speed = 0.4F;
        float taildegree = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        speed = 0.15F * speedmodifier;
        taildegree = 0.12F;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.tail.offsetY = offsetV + -1.0F + 5.5F;
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98);
                this.tail.offsetZ = 0;
                swaymodifier = 0;
                buried = 0;
                //Do some fully-buried wiggle animatins:
                this.chainWave(headBody, speed, -0.55F, 2.5, f2, 0.4F);
                this.chainSwing(headBody, speed, -0.55F, -2.5, f2, 0.4F);
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
            this.chainWave(headBody, speed, -0.05F * buried * 0.5F, 1, f2, 1);
            this.chainSwing(headBody, speed, -taildegree * buried * 0.7F, -1, f2, 1);

            this.body3.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
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
