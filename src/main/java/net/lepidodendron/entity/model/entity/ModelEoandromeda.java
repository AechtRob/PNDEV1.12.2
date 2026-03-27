package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelEoandromeda extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;

    public ModelEoandromeda() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.main.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 2, 5, -1.5F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.main.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, -3, 5, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.main.addChild(bone3);
        this.bone3.cubeList.add(new ModelBox(bone3, 2, 5, -1.5F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.main.addChild(bone4);
        this.bone4.cubeList.add(new ModelBox(bone4, -3, 5, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = -0.138F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(25);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 4.33F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:

        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);
        this.main.render(f);
        GlStateManager.disableBlend();
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        main.offsetY = 0.2F;

        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.main.scaleChildren = true;
            this.main.setScale(1.0F, 1.0F, 1.0F);
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, speed * 0.8F, 3.2F, false, f2, 0.6F);


            this.swing(bone, speed * 0.8F, 0.25F, true, 3.0F, 0, f2, 0.6F);
            AdvancedModelRenderer[] tentacleE1 = {this.bone};
            AdvancedModelRenderer[] tentacleE2 = {this.bone2};
            AdvancedModelRenderer[] tentacleE3 = {this.bone3};
            AdvancedModelRenderer[] tentacleE4 = {this.bone4};
            this.chainWave(tentacleE1, speed * 1.0F, 0.8F, -3, f2, 0.5F);
            this.chainFlap(tentacleE2, speed * 1.0F, -0.8F, -3, f2, 0.5F);
            this.chainWave(tentacleE3, speed * 1.0F, -0.8F, -3, f2, 0.5F);
            this.chainFlap(tentacleE4, speed * 1.0F, 0.8F, -3, f2, 0.5F);

        }
        else {
            this.main.scaleChildren = true;
            this.main.setScale(1.25F, 0.1F, 1.25F);
            this.main.offsetY = 0.0F;
        }
    }
}
