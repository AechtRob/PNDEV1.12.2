package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelEoandromeda extends AdvancedModelBase {
    private final AdvancedModelRenderer disk;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer arm8;

    public ModelEoandromeda() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.disk = new AdvancedModelRenderer(this);
        this.disk.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.disk.cubeList.add(new ModelBox(disk, 0, 21, -4.0F, -0.5F, -4.0F, 8, 2, 8, 0.0F, false));
        this.disk.cubeList.add(new ModelBox(disk, 0, 31, -5.0F, -0.5F, -3.0F, 1, 2, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -5.0F, -0.5F, -3.0F, 1, 2, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 31, -5.0F, -0.5F, -3.0F, 1, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 31, -5.0F, -0.5F, -3.0F, 1, 2, 6, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm);
        this.arm.cubeList.add(new ModelBox(arm, 8, 18, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.7854F, 0.0F);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 18, -4.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 1.5708F, 0.0F);
        this.arm3.cubeList.add(new ModelBox(arm3, 16, 15, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 2.3562F, 0.0F);
        this.arm4.cubeList.add(new ModelBox(arm4, 16, 12, -4.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 3.1416F, 0.0F);
        this.arm5.cubeList.add(new ModelBox(arm5, 8, 15, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, -2.3562F, 0.0F);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 15, -4.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, -1.5708F, 0.0F);
        this.arm7.cubeList.add(new ModelBox(arm7, 8, 12, -4.0F, 0.0F, 0.0F, 4, 0, 3, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.disk.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, -0.7854F, 0.0F);
        this.arm8.cubeList.add(new ModelBox(arm8, 0, 12, -4.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.96F);

        this.disk.render(f5 * 0.2F);
        GlStateManager.disableBlend();

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

        this.disk.offsetY = 1.2F;

        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.swing(disk, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(disk, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(disk, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(disk, -speed * 0.5F, 0.5F, false, f2, 0.6F);
            EntityPrehistoricFloraEoandromeda ee = (EntityPrehistoricFloraEoandromeda) e;
            this.disk.rotateAngleY = (float) Math.toRadians(ee.getRotationDegree());
        }
    }
}
