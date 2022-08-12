package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelBasilocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer smallestshell_r1;
    private final AdvancedModelRenderer asmallershellthanthateven_r1;
    private final AdvancedModelRenderer evensmallershell_r1;
    private final AdvancedModelRenderer smallershell_r1;
    private final AdvancedModelRenderer mainshell_r1;
    private final AdvancedModelRenderer bottomhalfshell_r1;

    public ModelBasilocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.5F, 24.25F, -0.85F);
        this.setRotateAngle(bone, -1.5272F, 0.0F, 0.0F);


        this.smallestshell_r1 = new AdvancedModelRenderer(this);
        this.smallestshell_r1.setRotationPoint(0.0F, -29.0F, -11.0F);
        this.bone.addChild(smallestshell_r1);
        this.setRotateAngle(smallestshell_r1, 0.7418F, 0.0F, 0.0F);
        this.smallestshell_r1.cubeList.add(new ModelBox(smallestshell_r1, 7, 8, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.asmallershellthanthateven_r1 = new AdvancedModelRenderer(this);
        this.asmallershellthanthateven_r1.setRotationPoint(0.0F, -24.25F, -7.5F);
        this.bone.addChild(asmallershellthanthateven_r1);
        this.setRotateAngle(asmallershellthanthateven_r1, 0.6109F, 0.0F, 0.0F);
        this.asmallershellthanthateven_r1.cubeList.add(new ModelBox(asmallershellthanthateven_r1, 27, 33, -2.0F, -6.0F, -2.0F, 3, 6, 3, 0.0F, false));

        this.evensmallershell_r1 = new AdvancedModelRenderer(this);
        this.evensmallershell_r1.setRotationPoint(0.0F, -18.25F, -6.5F);
        this.bone.addChild(evensmallershell_r1);
        this.setRotateAngle(evensmallershell_r1, 0.2618F, 0.0F, 0.0F);
        this.evensmallershell_r1.cubeList.add(new ModelBox(evensmallershell_r1, 44, 14, -3.0F, -8.0F, -3.0F, 5, 8, 5, 0.0F, false));

        this.smallershell_r1 = new AdvancedModelRenderer(this);
        this.smallershell_r1.setRotationPoint(0.0F, -11.25F, -5.5F);
        this.bone.addChild(smallershell_r1);
        this.setRotateAngle(smallershell_r1, 0.1309F, 0.0F, 0.0F);
        this.smallershell_r1.cubeList.add(new ModelBox(smallershell_r1, 36, 36, -5.0F, -8.0F, -4.0F, 9, 8, 8, 0.0F, false));

        this.mainshell_r1 = new AdvancedModelRenderer(this);
        this.mainshell_r1.setRotationPoint(0.0F, 9.75F, -6.5F);
        this.bone.addChild(mainshell_r1);
        this.setRotateAngle(mainshell_r1, -0.0436F, 0.0F, 0.0F);
        this.mainshell_r1.cubeList.add(new ModelBox(mainshell_r1, 0, 0, -6.0F, -22.0F, -5.0F, 11, 22, 11, 0.0F, false));

        this.bottomhalfshell_r1 = new AdvancedModelRenderer(this);
        this.bottomhalfshell_r1.setRotationPoint(3.5F, 11.0F, 4.5F);
        this.bone.addChild(bottomhalfshell_r1);
        this.setRotateAngle(bottomhalfshell_r1, 0.0873F, 0.0F, 0.0F);
        this.bottomhalfshell_r1.cubeList.add(new ModelBox(bottomhalfshell_r1, 44, 0, -9.0F, -8.0F, -8.0F, 10, 10, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.offsetY = -1.5F;
        this.bone.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
