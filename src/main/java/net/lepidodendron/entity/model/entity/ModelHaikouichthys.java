package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHaikouichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone7;

    public ModelHaikouichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(1.0F, 19.0F, -7.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, -3.0F, -2.5F, -4.0F, 4, 7, 10, 0.02F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 14, 42, -1.0F, -7.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-1.0F, 1.0F, -3.0F);
        this.bone2.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 43, 0, -1.5F, -2.0F, -5.0F, 3, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.25F, -1.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 9, -1.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.25F, -1.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3229F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 33, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -2.0F, -5.0F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5882F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, 1.49F, -0.01F, -1.5F, 1, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 5, -0.49F, -0.01F, -1.5F, 1, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, 0.0F, -2.0F, 3, 3, 2, -0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-1.0F, 0.5F, 6.0F);
        this.bone2.addChild(bone3);
        this.bone3.cubeList.add(new ModelBox(bone3, 26, 9, 0.0F, -9.0F, 0.0F, 0, 15, 8, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 17, -2.0F, -3.0F, -1.0F, 4, 7, 9, 0.01F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 4.0F, 8.0F);
        this.bone3.addChild(bone4);
        this.bone4.cubeList.add(new ModelBox(bone4, 28, 0, -1.5F, -6.0F, -1.0F, 3, 6, 9, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 20, 25, 0.0F, -14.0F, 0.0F, 0, 16, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1257F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 15, -1.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 7.75F);
        this.bone4.addChild(bone5);
        this.bone5.cubeList.add(new ModelBox(bone5, 36, 24, -1.0F, -5.0F, -0.75F, 2, 5, 8, -0.01F, false));
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 36, 0.0F, -11.0F, 0.25F, 0, 13, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.0F, 0.25F);
        this.bone5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1431F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 24, -0.5F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -0.5F, 7.25F);
        this.bone5.addChild(bone6);
        this.bone6.cubeList.add(new ModelBox(bone6, 42, 40, -0.5F, -3.5F, -1.0F, 1, 4, 8, -0.02F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 36, 30, 0.0F, -8.5F, 0.0F, 0, 11, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.bone6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1431F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 0, -0.5F, 0.0F, 0.0F, 1, 2, 7, -0.03F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.bone6.addChild(bone7);
        this.bone7.cubeList.add(new ModelBox(bone7, 29, 48, -0.5F, -1.5F, 0.0F, 1, 3, 7, -0.03F, false));
        this.bone7.cubeList.add(new ModelBox(bone7, 0, 23, 0.0F, -6.0F, 0.0F, 0, 10, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone2.render(f5 * 0.0575F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.bone2.rotateAngleY = (float) Math.toRadians(90);
        this.bone2.render(0.01F);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.bone2.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.bone3, this.bone4, this.bone5, this.bone6, this.bone7};
        float speed = 0.385F;
        if (!e.isInWater()) {
            speed = 0.715F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.148F, -1.85, f2, 0.95F);
            this.swing(bone2, speed, 0.18F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.bone2.rotateAngleZ = (float) Math.toRadians(90);
                this.bone2.offsetY = 1.30F;
                this.bob(bone2, -speed, 2F, false, f2, 1);
            }
        }
    }
}
